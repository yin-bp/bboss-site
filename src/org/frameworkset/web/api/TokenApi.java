package org.frameworkset.web.api;
/**
 * Copyright 2022 bboss
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.frameworkset.util.annotations.RequestBody;
import org.frameworkset.util.annotations.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Description: </p>
 * <p></p>
 * <p>Copyright (c) 2020</p>
 * @Date 2022/7/2
 * @author biaoping.yin
 * @version 1.0
 */
public class TokenApi {
	private static Logger logger = LoggerFactory.getLogger(TokenApi.class);



	/**
	 * 分页http服务
	 * @return
	 */
	public @ResponseBody
	Map getToken(@RequestBody String requestBody){
//		ApiBean apiBean = SimpleStringUtil.json2Object(parmas,ApiBean.class);

		Map token = new LinkedHashMap();
		token.put("code",200);
		token.put("message","身份令牌成功获取！");
		Map data = new LinkedHashMap();
		data.put("access_token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJkZWZhdWx0XzYxNTE4YjlmM2UyYmM3LjEzMDI5OTkxIiwiaWF0IjoxNjMyNzM0MTExLCJuYmYiOjE2MzI3MzQxMTEsImV4cCI6MTYzMjc0MTMxMSwiZGV2aWNlX2lkIjoiYXBwMDMwMDAwMDAwMDAwMSIsImFwcF9pZCI6ImFwcDAzIiwidXVpZCI6ImFkZmRhZmFkZmFkc2ZlMzQxMzJmZHNhZHNmYWRzZiIsInNlY3JldCI6ImFwcDAzMVEyVzNFd29ybGQxMzU3OVBhc3NBU0RGIiwiaXNzdWVfdGltZSI6MTYzMjczNDExMSwiand0X3NjZW5lIjoiZGVmYXVsdCJ9.mSl-JBUV7gTUapn9yV-VLfoU7dm-gxC7pON62DnD-9c");
		data.put("expires_time",7200);
		token.put("data",data);
		/**
		 * {
		 *     "code": 200,
		 *     "message": "身份令牌成功获取！",
		 *     "data": {
		 *         "access_token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJkZWZhdWx0XzYxNTE4YjlmM2UyYmM3LjEzMDI5OTkxIiwiaWF0IjoxNjMyNzM0MTExLCJuYmYiOjE2MzI3MzQxMTEsImV4cCI6MTYzMjc0MTMxMSwiZGV2aWNlX2lkIjoiYXBwMDMwMDAwMDAwMDAwMSIsImFwcF9pZCI6ImFwcDAzIiwidXVpZCI6ImFkZmRhZmFkZmFkc2ZlMzQxMzJmZHNhZHNmYWRzZiIsInNlY3JldCI6ImFwcDAzMVEyVzNFd29ybGQxMzU3OVBhc3NBU0RGIiwiaXNzdWVfdGltZSI6MTYzMjczNDExMSwiand0X3NjZW5lIjoiZGVmYXVsdCJ9.mSl-JBUV7gTUapn9yV-VLfoU7dm-gxC7pON62DnD-9c",
		 *         "expires_time": 7200
		 *     }
		 * }
		 */
		return token;
	}




}
