package com.crm.RMGYantra.GenericUtil;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseAPI_Class  {
	public DataBaseUtility dutil=new DataBaseUtility();
	@BeforeSuite
	public void OpenConnection() throws Throwable  {
		dutil.CreateConnection();
		
	}
	@AfterSuite
	public void CloseConnection() {
		
		dutil.Closeconnection();
	}
	
	
	
	

}
