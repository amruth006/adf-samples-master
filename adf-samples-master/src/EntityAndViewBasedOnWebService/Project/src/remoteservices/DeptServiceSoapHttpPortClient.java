/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// This source file is generated by Oracle tools and is subject to change
// It is a utility client for invoking the operations of the Web service port.
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.0.0, build 060119.1546.05277)

package remoteservices;

import oracle.webservices.transport.ClientTransport;
import oracle.webservices.OracleStub;
import javax.xml.rpc.ServiceFactory;
import javax.xml.rpc.Stub;

public class DeptServiceSoapHttpPortClient {
    private remoteservices.DeptService_PortType _port;
    
    public DeptServiceSoapHttpPortClient() throws Exception {
        ServiceFactory factory = ServiceFactory.newInstance();
        _port = ((remoteservices.DeptService_Service)factory.loadService(remoteservices.DeptService_Service.class)).getDeptServiceSoapHttpPort();
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            remoteservices.DeptServiceSoapHttpPortClient myPort = new remoteservices.DeptServiceSoapHttpPortClient();
            System.out.println("calling " + myPort.getEndpoint());
            // Add your own code here
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * delegate all operations to the underlying implementation class.
     */
    
    public void deleteDepartmentByDeptno(Integer deptno) throws java.rmi.RemoteException {
        _port.deleteDepartmentByDeptno(deptno);
    }
    
    public long estimateCount(java.util.Map searchCriteria) throws java.rmi.RemoteException {
        return _port.estimateCount(searchCriteria);
    }
    
    public remoteservices.types.deptws.server.webservice.types.Department findDepartmentByDeptno(Integer deptno) throws java.rmi.RemoteException {
        return _port.findDepartmentByDeptno(deptno);
    }
    
    public remoteservices.types.deptws.server.webservice.types.Department insertDepartment(remoteservices.types.deptws.server.webservice.types.Department department) throws java.rmi.RemoteException {
        return _port.insertDepartment(department);
    }
    
    public remoteservices.types.deptws.server.webservice.types.Department mergeDepartment(remoteservices.types.deptws.server.webservice.types.Department department) throws java.rmi.RemoteException {
        return _port.mergeDepartment(department);
    }
    
    public remoteservices.types.deptws.server.webservice.types.Department[] retrieveDepartmentData(java.util.Map searchCriteria) throws java.rmi.RemoteException {
        return _port.retrieveDepartmentData(searchCriteria);
    }
    
    public remoteservices.types.deptws.server.webservice.types.Department updateDepartment(remoteservices.types.deptws.server.webservice.types.Department department) throws java.rmi.RemoteException {
        return _port.updateDepartment(department);
    }
    
    
    /**
     * used to access the JAX-RPC level APIs
     * returns the interface of the port instance
     */
    public remoteservices.DeptService_PortType getPort() {
        return _port;
    }
    
    public String getEndpoint() {
        return (String) ((Stub) _port)._getProperty(Stub.ENDPOINT_ADDRESS_PROPERTY);
    }
    
    public void setEndpoint(String endpoint) {
        ((Stub) _port)._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, endpoint);
    }
    
    public String getPassword() {
        return (String) ((Stub) _port)._getProperty(Stub.PASSWORD_PROPERTY);
    }
    
    public void setPassword(String password) {
        ((Stub) _port)._setProperty(Stub.PASSWORD_PROPERTY, password);
    }
    
    public String getUsername() {
        return (String) ((Stub) _port)._getProperty(Stub.USERNAME_PROPERTY);
    }
    
    public void setUsername(String username) {
        ((Stub) _port)._setProperty(Stub.USERNAME_PROPERTY, username);
    }
    
    public void setMaintainSession(boolean maintainSession) {
        ((Stub) _port)._setProperty(Stub.SESSION_MAINTAIN_PROPERTY, Boolean.valueOf(maintainSession));
    }
    
    public boolean getMaintainSession() {
        return ((Boolean) ((Stub) _port)._getProperty(Stub.SESSION_MAINTAIN_PROPERTY)).booleanValue();
    }
    
    /**
     * returns the transport context
     */
    public ClientTransport getClientTransport() {
        return ((OracleStub) _port).getClientTransport();
    }
    
}
