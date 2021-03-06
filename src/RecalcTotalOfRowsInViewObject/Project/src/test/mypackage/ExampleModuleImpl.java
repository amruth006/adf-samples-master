/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.mypackage;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class ExampleModuleImpl extends ApplicationModuleImpl 
{
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public ExampleModuleImpl()
  {
  }

  /**
   * 
   *  Container's getter for EmpView
   */
  public ViewObjectImpl getEmpView()
  {
    return (ViewObjectImpl)findViewObject("EmpView");
  }

  /**
   * 
   *  Sample exportable method.
   */
  public void sampleExampleModuleImplExportable()
  {
  }

  /**
   * 
   *  Sample exportable method.
   */
  public void sampleExampleModuleImplExportable2(String testParam1)
  {
  }

  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args)
  {
    launchTester("test.mypackage", "ExampleModuleLocal");
  }
}
