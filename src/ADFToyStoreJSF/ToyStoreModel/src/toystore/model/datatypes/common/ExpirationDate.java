/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/datatypes/common/ExpirationDate.java,v 1.1.1.1 2006/01/26 21:47:22 steve Exp $
package toystore.model.datatypes.common;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import oracle.jbo.Transaction;
import oracle.jbo.domain.DataCreationException;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
/**
 * This custom datatype implements an immutable domain class that
 * maps to a VARCHAR column containing values like '10/2004' representing
 * expiration dates of credit cards. We could have chosen to implement
 * this as a domain that stores itself in a DATE column instead of a
 * VARCHAR column, but since the Java Pet Store demo schema stored the
 * information in a VARCHAR column, we decided to illustrate how to
 * accommodate that case using domains.
 */
public class ExpirationDate implements DomainInterface, Serializable {
  private Date mDate;
  private String mDateAsString;

  protected ExpirationDate() {
    mDate = new Date();
    convertDateToStringFormat();
  }
  /**
   * Allow expiration date to be constructed from two
   * strings representing month and year
   */
  public ExpirationDate(String monthVal, String yearVal) {
    this(monthVal + '/' + yearVal);
  }
  public ExpirationDate(String val) {
    validate(val);
    convertDateToStringFormat();
  }

  /**
   * Return the value of the expiration date as a java.util.Date
   */
  public Date getDateValue() {
    return mDate;
  }
  /**
   * The getData() method must return the type of object that JDBC will
   * see for storage in the database. Since we want this ExpirationDate
   * datatype to map to a VARCHAR column in the database, we return the
   * string format of the date
   */
  public Object getData() {
    return mDateAsString;
  }
  /**
   *
   * <b>Internal:</b> <em>Applications should not use this method.</em>
   */
  public void setContext(DomainOwnerInterface owner, Transaction trans,
    Object obj) {
  }
  /**
   * Performs basic validation on strings that represent expiration dates
   * in the format of MM/YYYY. Note that in the process of testing whether
   * the string represents a valid month and year, we end up setting
   * the private member variable mDate with the date value, so if the
   * validate() method does not throw an exception, the mDate will be setup.
   */
  protected void validate(String val) {
    if (val != null) {
      if ((val.length() != 7) || (val.charAt(2) != '/') ||
            !isAllDigitsExceptSlashAtPositionTwo(val) ||
            !isValidMonthAndYear(val)) {
        throw new DataCreationException(ErrorMessages.class,
          ErrorMessages.INVALID_EXPRDATE, null, null);
      }
    }
  }
  /**
   * Returns true if all digits except position 2 (zero-based) are digits
   */
  private boolean isAllDigitsExceptSlashAtPositionTwo(String val) {
    for (int z = 0, max = val.length(); z < max; z++) {
      if ((z != 2) && !Character.isDigit(val.charAt(z))) {
        return false;
      }
    }
    return true;
  }
  /**
   * Returns true if the val string, assumed to be in "MM/YYYY" format
   * is a valid month and year value, setting the mDate member variable
   * if they are valid.
   */
  private boolean isValidMonthAndYear(String val) {
    try {
      int month = Integer.parseInt(val.substring(0, 2));
      int year = Integer.parseInt(val.substring(3));
      Calendar c = Calendar.getInstance();
      c.setLenient(false);
      c.set(year, month - 1, 1); // Month is zero-based !
      mDate = c.getTime();
    } catch (IllegalArgumentException i) {
      return false;
    }
    return true;
  }
  public String toString() {
    return mDateAsString;
  }
  /**
   * Convert mDate to String format
   */
  private void convertDateToStringFormat() {
    if (mDate != null) {
      SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
      mDateAsString = sdf.format(mDate);
    }
  }
  /**
   * Return true if the expiration date is in the future
   */
  public boolean isFutureDate() {
    return mDate.compareTo(new Date()) > 0;
  }
  /**
   * Compare the Expiration Dates by comparing their respective
   * getData() values
   */
  public boolean equals(Object obj) {
    if (obj instanceof DomainInterface) {
      Object thisData = getData();
      if (thisData != null) {
        return thisData.equals(((DomainInterface) obj).getData());
      }
      return ((DomainInterface) obj).getData() == null;
    }
    return false;
  }
}
