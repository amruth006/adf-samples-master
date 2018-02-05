/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;

import oracle.jbo.Session;
import oracle.jbo.server.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 06 17:12:27 CET 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for DeptView1.
     * @return DeptView1
     */
    public OnlyAddNewRowIfValidViewObjectImpl getDeptView1() {
        return (OnlyAddNewRowIfValidViewObjectImpl)findViewObject("DeptView1");
    }

    /**
     * Container's getter for CreateDeptView.
     * @return CreateDeptView
     */
    public OnlyAddNewRowIfValidViewObjectImpl getCreateDeptView() {
        return (OnlyAddNewRowIfValidViewObjectImpl)findViewObject("CreateDeptView");
    }
    
    @Override
    protected void prepareSession(Session session) {
        super.prepareSession(session);
        getDeptView1().setOnlyAddNewRowIfValid(true);
    }    
}
