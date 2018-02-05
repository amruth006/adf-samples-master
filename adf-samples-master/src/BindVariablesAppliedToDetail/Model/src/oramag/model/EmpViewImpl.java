/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package oramag.model;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmpViewImpl extends ViewObjectImpl {
    /**This is the default constructor (do not remove)
     */
    public EmpViewImpl() {
    }

    /**Gets the bind variable value for LowSalary
     */
    public Number getLowSalary() {
        return (Number)getNamedWhereClauseParam("LowSalary");
    }

    /**Sets <code>value</code> for bind variable LowSalary
     */
    public void setLowSalary(Number value) {
        setNamedWhereClauseParam("LowSalary", value);
    }

    /**Gets the bind variable value for HighSalary
     */
    public Number getHighSalary() {
        return (Number)getNamedWhereClauseParam("HighSalary");
    }

    /**Sets <code>value</code> for bind variable HighSalary
     */
    public void setHighSalary(Number value) {
        setNamedWhereClauseParam("HighSalary", value);
    }
}
