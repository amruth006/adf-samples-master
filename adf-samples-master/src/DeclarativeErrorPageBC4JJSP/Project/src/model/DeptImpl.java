/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package model;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
import oracle.jbo.Key;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class DeptImpl extends EntityImpl 
{
  protected static final int DEPTNO = 0;
  protected static final int DNAME = 1;
  protected static final int LOC = 2;

  private static EntityDefImpl mDefinitionObject;

  /**
   * 
   * This is the default constructor (do not remove)
   */
  public DeptImpl()
  {
  }

  /**
   * 
   * Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    if (mDefinitionObject == null)
    {
      mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("model.Dept");
    }
    return mDefinitionObject;
  }


  /**
   * 
   * Gets the attribute value for Deptno, using the alias name Deptno
   */
  public Number getDeptno()
  {
    return (Number)getAttributeInternal(DEPTNO);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for Deptno
   */
  public void setDeptno(Number value)
  {
    setAttributeInternal(DEPTNO, value);
  }

  /**
   * 
   * Gets the attribute value for Dname, using the alias name Dname
   */
  public String getDname()
  {
    return (String)getAttributeInternal(DNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for Dname
   */
  public void setDname(String value)
  {
    setAttributeInternal(DNAME, value);
  }

  /**
   * 
   * Gets the attribute value for Loc, using the alias name Loc
   */
  public String getLoc()
  {
    return (String)getAttributeInternal(LOC);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for Loc
   */
  public void setLoc(String value)
  {
    setAttributeInternal(LOC, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
      {
      case DEPTNO:
        return getDeptno();
      case DNAME:
        return getDname();
      case LOC:
        return getLoc();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
      {
      case DEPTNO:
        setDeptno((Number)value);
        return;
      case DNAME:
        setDname((String)value);
        return;
      case LOC:
        setLoc((String)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }

  /**
   * 
   * Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(Number deptno)
  {
    return new Key(new Object[] {deptno});
  }


}
