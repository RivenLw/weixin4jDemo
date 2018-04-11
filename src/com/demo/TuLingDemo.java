package com.demo;

import com.yellowcong.tuling.client.TulingClient;
import com.yellowcong.tuling.model.Message;

public class TuLingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String url = "http://openapi.tuling123.com/openapi/api/v2";
		
		String apikey = "443a388387e34252a9b8953536a8f25f";
		
		TulingClient tulingClient =  new TulingClient(url, apikey);
		
		String aaa = "{\"reqType\":0,\"perception\": {\"inputText\": {\"text\": \"附近的酒店\"},\"selfInfo\": {\"location\": {\"city\": \"北京\",\"province\": \"北京\",\"street\": \"信息路\"}}},\"userInfo\": {\"apiKey\": \"443a388387e34252a9b8953536a8f25f\",\"userId\": \"529234213\"}}";
		
		
		Message message = tulingClient.sendMessage(aaa);
		
		System.out.println(message.getText());
		
		
		
	}

}
