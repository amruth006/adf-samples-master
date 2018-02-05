/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/businessobjects/common/SignonImplMsgBundle.java,v 1.1.1.1 2006/01/26 21:47:21 steve Exp $
package toystore.model.businessobjects.common;
import oracle.jbo.common.JboResourceBundle;
import toystore.fwk.exceptions.ErrorMessages;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
public class SignonImplMsgBundle extends JboResourceBundle {
  static final Object[][] sMessageStrings = {
    {
      ErrorMessages.ENTITY_ALREADY_EXISTS,
      "Another user has already chosen this name. Please try another."
    },
    { "Username_LABEL", "User ID" },
    { "Username_TOOLTIP", "Enter a username to identify you on this site." },
    { "Password_LABEL", "Password" },
    { "Password_TOOLTIP", "Enter your password" },
  };

  /**
   *
   * This is the default constructor (do not remove)
   */
  public SignonImplMsgBundle() {
  }

  /**
   *
   * @return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }
}
