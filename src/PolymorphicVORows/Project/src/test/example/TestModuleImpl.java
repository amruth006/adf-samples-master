/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.example;
import oracle.jbo.Key;
import oracle.jbo.server.ApplicationModuleImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---------------------------------------------------------------------

public class TestModuleImpl extends ApplicationModuleImpl implements test.example.common.TestModule  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }

  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test.example", "TestModuleLocal");
  }

  /**
   * 
   *  Container's getter for People
   */
  public PeopleImpl getPeople() {
    return (PeopleImpl)findViewObject("People");
  }

  public String findPersonName(Key k) {
    String name = null;
    PersonImpl p = (PersonImpl)PersonImpl.getDefinitionObject().findByPrimaryKey(getDBTransaction(),k);
    if (p != null) {
      name = p.getName();
    }
    return name;
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

}
