/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;

import test.model.common.AppModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
  /**This is the default constructor (do not remove)
   */
  public AppModuleImpl() {
  }

  /**Container's getter for SettingsView1
   */
  public ViewObjectImpl getSettingsView1() {
    return (ViewObjectImpl)findViewObject("SettingsView1");
  }
  public void flipFlopAnotherBoolean() {
      RowSetIterator rsi = getSettingsView1().createRowSetIterator(null);
      while (rsi.hasNext()) {
          Row r = rsi.next();
          Boolean b = (Boolean)r.getAttribute("AnotherBoolean");
          if (b == null || Boolean.FALSE.equals(b)) {
              b = Boolean.TRUE;
          }
          else {
              b = Boolean.FALSE;              
          }
          r.setAttribute("AnotherBoolean",b);
      }
      
      
      rsi.closeRowSetIterator();
  }

  /**Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test.model", /* package name */
      "AppModuleLocal" /* Configuration Name */);
  }
}
