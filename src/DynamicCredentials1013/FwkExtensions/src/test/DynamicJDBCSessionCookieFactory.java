/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test;

import java.util.Hashtable;
import java.util.Properties;
import javax.servlet.http.HttpSession;
import oracle.jbo.client.Configuration;
import oracle.jbo.common.ampool.ApplicationPool;
import oracle.jbo.common.ampool.EnvInfoProvider;
import oracle.jbo.common.ampool.SessionCookie;
import oracle.jbo.http.HttpSessionCookieFactory;

public class DynamicJDBCSessionCookieFactory extends HttpSessionCookieFactory { 
  public SessionCookie createSessionCookie(String name,
                                           String value,
                                           ApplicationPool pool, 
                                           Properties properties) { 
    SessionCookie cookie = super.createSessionCookie(name, value, pool, properties);
    if (properties != null) { 
      HttpSession session = (HttpSession)properties.get(HTTP_SESSION);
      if(session != null) { 
        Hashtable env = pool.getEnvironment();
        env.remove(Configuration.DB_USERNAME_PROPERTY); 
        env.remove(Configuration.DB_PASSWORD_PROPERTY); 
        EnvInfoProvider provider = new DynamicJDBCEnvInfoProvider(
            (String)session.getAttribute(Configuration.DB_USERNAME_PROPERTY), 
            (String)session.getAttribute(Configuration.DB_PASSWORD_PROPERTY),
            (String)session.getAttribute(Configuration.DB_CONNECT_STRING_PROPERTY)
        ); 
        cookie.setEnvInfoProvider(provider);
      } 
    } 
    return cookie; 
  } 

  public Class getSessionCookieClass() {
    try {
      return Class.forName("test.DynamicJDBCHttpSessionCookieImpl");
    }
    catch (ClassNotFoundException cnfe) 
    {
      cnfe.printStackTrace();
      return null;
    }
  }
} 
