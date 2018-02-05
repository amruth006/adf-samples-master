/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;
import com.sun.java.util.collections.HashMap;
import oracle.jbo.XMLInterface;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
import oracle.xml.parser.v2.XMLDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class DepartmentsViewRowImpl extends ViewRowImpl 
{


  public static final int DEPARTMENTID = 0;
  public static final int DEPARTMENTNAME = 1;
  public static final int MANAGERID = 2;
  public static final int LOCATIONID = 3;
  public static final int DEPARTMENTXML = 4;
  public static final int EMPLOYEESVIEW = 5;
  public static final int JOBHISTORYVIEW = 6;
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public DepartmentsViewRowImpl()
  {
  }

  /**
   * 
   *  Gets Departments entity object.
   */
  public DepartmentsImpl getDepartments()
  {
    return (DepartmentsImpl)getEntity(0);
  }

  /**
   * 
   *  Gets the attribute value for DEPARTMENT_ID using the alias name DepartmentId
   */
  public Number getDepartmentId()
  {
    return (Number)getAttributeInternal(DEPARTMENTID);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for DEPARTMENT_ID using the alias name DepartmentId
   */
  public void setDepartmentId(Number value)
  {
    setAttributeInternal(DEPARTMENTID, value);
  }

  /**
   * 
   *  Gets the attribute value for DEPARTMENT_NAME using the alias name DepartmentName
   */
  public String getDepartmentName()
  {
    return (String)getAttributeInternal(DEPARTMENTNAME);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for DEPARTMENT_NAME using the alias name DepartmentName
   */
  public void setDepartmentName(String value)
  {
    setAttributeInternal(DEPARTMENTNAME, value);
  }

  /**
   * 
   *  Gets the attribute value for MANAGER_ID using the alias name ManagerId
   */
  public Number getManagerId()
  {
    return (Number)getAttributeInternal(MANAGERID);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for MANAGER_ID using the alias name ManagerId
   */
  public void setManagerId(Number value)
  {
    setAttributeInternal(MANAGERID, value);
  }

  /**
   * 
   *  Gets the attribute value for LOCATION_ID using the alias name LocationId
   */
  public Number getLocationId()
  {
    return (Number)getAttributeInternal(LOCATIONID);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for LOCATION_ID using the alias name LocationId
   */
  public void setLocationId(Number value)
  {
    setAttributeInternal(LOCATIONID, value);
  }

  /**
   * 
   *  Gets the associated <code>RowIterator</code> using master-detail link EmployeesView
   */
  public oracle.jbo.RowIterator getEmployeesView()
  {
    return (oracle.jbo.RowIterator)getAttributeInternal(EMPLOYEESVIEW);
  }

  /**
   * 
   *  Gets the associated <code>RowIterator</code> using master-detail link JobHistoryView
   */
  public oracle.jbo.RowIterator getJobHistoryView()
  {
    return (oracle.jbo.RowIterator)getAttributeInternal(JOBHISTORYVIEW);
  }

  /**
   * 
   *  getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
      {
      case DEPARTMENTID:
        return getDepartmentId();
      case DEPARTMENTNAME:
        return getDepartmentName();
      case MANAGERID:
        return getManagerId();
      case LOCATIONID:
        return getLocationId();
      case DEPARTMENTXML:
        return getDepartmentXML();
      case EMPLOYEESVIEW:
        return getEmployeesView();
      case JOBHISTORYVIEW:
        return getJobHistoryView();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }

  /**
   * 
   *  setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
      {
      case DEPARTMENTID:
        setDepartmentId((Number)value);
        return;
      case DEPARTMENTNAME:
        setDepartmentName((String)value);
        return;
      case MANAGERID:
        setManagerId((Number)value);
        return;
      case LOCATIONID:
        setLocationId((Number)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }

  /**
   * 
   *  Gets the attribute value for the calculated attribute DepartmentXML
   */
  public Document getDepartmentXML()
  {
    HashMap h = new HashMap();
    h.put("test.model.DepartmentsView",new String[]{"DepartmentId","DepartmentName","EmployeesView","JobHistoryView"});
    h.put("test.model.EmployeesView",new String[]{"EmployeeId","FirstName","LastName","Email","EmployeesView"});
    h.put("test.model.JobHistoryView",new String[]{"StartDate","StartDate"});
    Node n = writeXML(XMLInterface.XML_OPT_LIMIT_RANGE,h);
    Document d = n.getOwnerDocument();
    n = ((XMLDocument)d).adoptNode(n);
    d.appendChild(n);    
    return (Document)d;
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for the calculated attribute DepartmentXML
   */
  public void setDepartmentXML(Document value)
  {
    setAttributeInternal(DEPARTMENTXML, value);
  }
}
