/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import oracle.jbo.CSMessageBundle;
import oracle.jbo.SQLStmtException;
import oracle.jbo.server.ApplicationModuleImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---------------------------------------------------------------------

public class TestModuleImpl extends ApplicationModuleImpl implements test.model.common.TestModule  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }

  PreparedStatement callStoredProcPST = null;
  private static final String STMT = "begin test_procedure(:1); end;";
  /**
   * Create prepared statement and use it to invoke the PLSQL block
   * in the STMT variable. If its the first time we create the statement
   * and then can reuse it multiple times by just rebinding and rexecuting
   * it the second and subsequent times. We close the prepared statement
   * that we're holding in the "calledStoredProcPST" member variable
   * in the overridden remove() method 
   * 
   * @param message Message to pass to stored procedure as a parameter.
   */
  public void callStoredProcedure(String message) {
    if (callStoredProcPST == null) {
      callStoredProcPST = getDBTransaction().createPreparedStatement(STMT,0);
    }
    try {
      callStoredProcPST.setString(1,message);
      callStoredProcPST.execute();
    }
    catch (SQLException e) {
      throw new SQLStmtException(CSMessageBundle.class,
                                 CSMessageBundle.EXC_SQL_EXECUTE_COMMAND,
                                 STMT,e);
    }
    /*
     * NOTE: No finally block since we close the prepared statement
     *       in the overridden remove() method below.
     */
  }

  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test.model", "TestModuleLocal");
  }
  /**
   * If we are running with jbo.doconnectionpooling=true then
   * the AM pooling framework will disconnect our AM instance
   * from its JDBC connection upon each managed AM checkin to
   * the AM pool, so we need to close our JDBC prepared statement
   * appropriately since it's only valid in the context of the
   * JDBC connection that we used to create it.
   */
  protected void beforeDisconnect() {
    closeLocalJDBCStatements();
    super.beforeDisconnect();
  }
  /**
   * Cleanup our prepared statement that we're reusing to invoke
   * the TEST_PROCEDURE stored procedure when the AM gets removed.
   * Among other situations, this would occur when an AM instance
   * is removed from the AM pool due to pool cleanup.
   */
  public void remove() {
    super.remove();
    closeLocalJDBCStatements();
  }
  /**
   * Close our JDBC prepared statement that we're reusing
   * across invocations.
   */
  private void closeLocalJDBCStatements() {
    if (callStoredProcPST != null) {
      try {
        callStoredProcPST.close();
      }
      catch (SQLException e) {
        e.printStackTrace();
      }
      finally {
        callStoredProcPST = null;
      }
    }
  }

  /**
   * 
   *  Container's getter for SomeView
   */
  public SomeViewImpl getSomeView() {
    return (SomeViewImpl)findViewObject("SomeView");
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
