package test.mypackage.common;
import oracle.jbo.common.JboResourceBundle;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class EmpImplMsgBundle extends JboResourceBundle  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public EmpImplMsgBundle() {
  }

  /**
   * 
   * @return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }

  static final Object[][] sMessageStrings = {
    {"EndDate_LABEL", "Termination Date"},
    {"Hiredate_LABEL", "Date of Hire"}};





}