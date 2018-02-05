/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;
import oracle.jbo.server.ApplicationModuleImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---------------------------------------------------------------------

public class TestModuleImpl extends ApplicationModuleImpl {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }


  /**
   * 
   *  Sample exportable method.
   */
  public void sampleTestModuleImplExportable() {
  }

  /**
   * 
   *  Sample exportable method.
   */
  public void sampleTestModuleImplExportable2(String testParam1) {
  }

  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test.model", "TestModuleLocal");
  }

  /**
   * 
   *  Container's getter for DeptView
   */
  public DeptViewImpl getDeptView() {
    return (DeptViewImpl)findViewObject("DeptView");
  }
}