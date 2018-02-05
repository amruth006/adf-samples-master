/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package example.model;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentDataFromXMLImpl extends ViewObjectImpl {
  /**This is the default constructor (do not remove)
   */
  public DepartmentDataFromXMLImpl() {
  }

  /**Gets the bind variable value for xmltext
   */
  public String getxmltext() {
    return (String)getNamedWhereClauseParam("xmltext");
  }

  /**Sets <code>value</code> for bind variable xmltext
   */
  public void setxmltext(String value) {
    setNamedWhereClauseParam("xmltext", value);
  }
}
