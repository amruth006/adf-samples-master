/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.example.client;
import oracle.jbo.client.remote.RowImpl;
import oracle.jbo.domain.Number;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---------------------------------------------------------------------

public class PeopleRowClient extends RowImpl implements test.example.common.PeopleRow  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public PeopleRowClient() {
  }


    public void doPersonThing() {
        Object _ret = 
            getApplicationModuleProxy().riInvokeExportedMethod(this,"doPersonThing",null,null);
        return;
    }

    public Number getId() {
        return (Number)getAttribute("Id");
    }

    public void setId(Number value) {
        setAttribute("Id", value);
    }

    public String getName() {
        return (String)getAttribute("Name");
    }

    public void setName(String value) {
        setAttribute("Name", value);
    }

    public String getSex() {
        return (String)getAttribute("Sex");
    }

    public void setSex(String value) {
        setAttribute("Sex", value);
    }
}