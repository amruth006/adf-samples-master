/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model.queries;
import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;

import test.model.entities.ExpertiseAreaImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProductExpertiseAreasImpl extends ViewObjectImpl {
  /**This is the default constructor (do not remove)
   */
  public ProductExpertiseAreasImpl() {
  }

  /**Gets the bind variable value for Bind_UserId
   */
  public Number getBind_UserId() {
    return (Number)getNamedWhereClauseParam("Bind_UserId");
  }
  
  /*
   * This method is used by the companion ProductExpertiseAreasRowImpl class
   * to notify the view object that the view attributes related to the
   * underlying ExpertiseArea entity object have changed. This allows the
   * user interface to immediately update with the new values.
   */
  void notifyUpdatedReferencedExpertiseAreaEntityForViewRow(ProductExpertiseAreasRowImpl viewRow) {
    notifyRowUpdated((ViewRowSetImpl)viewRow.getRowSet(),
                     new Row[]{viewRow},
                     new int[]{ProductExpertiseAreasRowImpl.EXPERTISELEVEL,
                               ProductExpertiseAreasRowImpl.PRODID1,
                               ProductExpertiseAreasRowImpl.USERID
                     });
  }

  /**Sets <code>value</code> for bind variable Bind_UserId
   */
  public void setBind_UserId(Number value) {
    setNamedWhereClauseParam("Bind_UserId", value);
  }
}
