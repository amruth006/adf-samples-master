/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/dataaccess/common/ShoppingCartRow.java,v 1.1.1.1 2006/01/26 21:47:22 steve Exp $
package toystore.model.dataaccess.common;
import oracle.jbo.Row;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
/**
 *
 * Generated interface. Do not modify.
 */
public interface ShoppingCartRow extends Row {
  String getItemid();
  void setItemid(String value);
  Long getQuantity();
  void setQuantity(Long value);
  oracle.jbo.domain.Number getListprice();
  void setListprice(oracle.jbo.domain.Number value);
  String getName();
  void setName(String value);
  Double getExtendedTotal();
  void setExtendedTotal(Double value);
  String getInStock();
  void setInStock(String value);
}
