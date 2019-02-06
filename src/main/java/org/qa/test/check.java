package org.qa.test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.qa.base.TestBase;
import org.qa.client.GetClient;

public class check extends TestBase {
	TestBase base;
	String url1;
	String end;
	String url;
	GetClient getclient;
	CloseableHttpResponse closeablehttpresponse;
	
	public void check() {
		base= new TestBase();
		url1=prop.getProperty("URL");
		end=prop.getProperty("serviceURL");
		url= url1+end;
	}

	//get the status code
	public void status() {
		getclient =new GetClient();
		closeablehttpresponse =getclient.java.
				closeable new
	}
}
