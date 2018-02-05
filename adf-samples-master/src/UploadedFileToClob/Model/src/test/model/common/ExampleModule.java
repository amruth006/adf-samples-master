/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model.common;
import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.ClobDomain;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public interface ExampleModule extends ApplicationModule {
    void saveUploadedFile(ClobDomain content, String filename);
}
