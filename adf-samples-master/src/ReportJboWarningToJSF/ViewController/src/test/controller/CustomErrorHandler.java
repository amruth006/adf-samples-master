/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.controller;

import java.util.Iterator;

import oracle.adf.model.BindingContext;
import oracle.adf.model.bc4j.DCJboDataControl;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCErrorHandlerImpl;

import oracle.jbo.ApplicationModule;
import oracle.jbo.JboException;
import oracle.jbo.JboExceptionHandler;
import oracle.jbo.JboWarning;

public class CustomErrorHandler extends DCErrorHandlerImpl {
  /**
   * Constructor for custom error handler.
   * 
   * @param setToThrow should exceptions throw or not
   */
  public CustomErrorHandler(boolean setToThrow) {
    super(setToThrow);
  }
  
  /**
   * Overridden ADF binding framework method to customize the way
   * that Exceptions are reported to the client.
   * 
   * Here we set the "append codes" flag to false on each JboException
   * in the exception (and any detail JboExceptions it contains)
   * 
   * @param bc BindingContainer
   * @param ex exception being reported
   */
  public void reportException(DCBindingContainer bc, Exception ex) {
     //Force JboException's reported to the binding layer to avoid
     //printing out the JBO-XXXXX product prefix and code.
    disableAppendCodes(ex);
    super.reportException(bc, ex);
  }
  
  private void disableAppendCodes(Exception ex) {
    if (ex instanceof JboException) {
      JboException jboEx = (JboException) ex;
      jboEx.setAppendCodes(false);
      Object[] detailExceptions = jboEx.getDetails();
      if ((detailExceptions != null) && (detailExceptions.length > 0)) {
        for (int z = 0, numEx = detailExceptions.length; z < numEx; z++) {
          disableAppendCodes((Exception) detailExceptions[z]);
        }
      }
    }
  }
}
