package org.qa.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class GetClient {

	//get method
	
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient closeablehttpclient=HttpClients.createDefault();
		HttpGet get =new HttpGet(url);
		CloseableHttpResponse closeablehttpresponse = closeablehttpclient.execute(get);
		return closeablehttpresponse;
	}
}
