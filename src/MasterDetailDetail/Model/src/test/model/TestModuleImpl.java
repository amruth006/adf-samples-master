/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---------------------------------------------------------------------

public class TestModuleImpl extends ApplicationModuleImpl  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }










  /**
   * 
   *  Container's getter for CountrRegFkLink1
   */
  public ViewLinkImpl getCountrRegFkLink1() {
    return (ViewLinkImpl)findViewLink("CountrRegFkLink1");
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
   *  Container's getter for Regions
   */
  public RegionsViewImpl getRegions() {
    return (RegionsViewImpl)findViewObject("Regions");
  }

  /**
   * 
   *  Container's getter for Countries
   */
  public CountriesViewImpl getCountries() {
    return (CountriesViewImpl)findViewObject("Countries");
  }

  /**
   * 
   *  Container's getter for Locations
   */
  public LocationsViewImpl getLocations() {
    return (LocationsViewImpl)findViewObject("Locations");
  }

  /**
   * 
   *  Container's getter for Departments
   */
  public DepartmentsViewImpl getDepartments() {
    return (DepartmentsViewImpl)findViewObject("Departments");
  }

  /**
   * 
   *  Container's getter for LocCIdFkLink2
   */
  public ViewLinkImpl getLocCIdFkLink2() {
    return (ViewLinkImpl)findViewLink("LocCIdFkLink2");
  }

  /**
   * 
   *  Container's getter for DeptLocFkLink2
   */
  public ViewLinkImpl getDeptLocFkLink2() {
    return (ViewLinkImpl)findViewLink("DeptLocFkLink2");
  }
}
