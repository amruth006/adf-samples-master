/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package example.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public interface ExampleModule extends ApplicationModule {
  void collectDataUsingStoredProcedure(String v, Number n, Date d);
}
