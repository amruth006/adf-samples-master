/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model.common;
import oracle.jbo.common.JboResourceBundle;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public class DeptImplMsgBundle extends JboResourceBundle {
  static final Object[][] sMessageStrings = {
{ "Dname_Rule_0", "Dname cannot be 'X'" }};

  /**This is the default constructor (do not remove)
   */
  public DeptImplMsgBundle() {
  }

  /**@return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }
}
