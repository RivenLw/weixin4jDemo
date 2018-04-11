package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.weixin4j.Configuration;
import org.weixin4j.Menu;
import org.weixin4j.Weixin;
import org.weixin4j.WeixinException;
import org.weixin4j.http.OAuth;
import org.weixin4j.http.OAuthToken;
import org.weixin4j.menu.SingleButton;
import org.weixin4j.menu.ViewButton;

import com.alibaba.fastjson.JSONObject;

public class MenuDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ViewButton viewButton = new ViewButton("百度", "https://www.baidu.com/");
		ViewButton sub_viewButton = new ViewButton("比利比利", "https://www.bilibili.com/");
		
		List<SingleButton> singleButtons = new ArrayList<SingleButton>();
		singleButtons.add(sub_viewButton);
		
		
		SingleButton singleButton = new SingleButton("R18");
		singleButton.setSubButton(singleButtons);
		
		List<SingleButton> lSingleButtons = new ArrayList<SingleButton>();
		lSingleButtons.add(viewButton);
		lSingleButtons.add(singleButton);
		
		Menu menu = new Menu();
		menu.setButton(lSingleButtons);
		
		JSONObject jsonObject = menu.toJSONObject();
		
		System.out.println(jsonObject.toJSONString());
		
		
		/*try {
			OAuthToken authToken = weixin.login(Configuration.getOAuthAppId(), Configuration.getOAuthSecret());
			System.out.println(authToken.getAccess_token());
		} catch (WeixinException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}

}
