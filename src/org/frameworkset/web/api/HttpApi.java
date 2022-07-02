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

import com.frameworkset.util.SimpleStringUtil;
import org.frameworkset.util.annotations.RequestBody;
import org.frameworkset.util.annotations.ResponseBody;

import java.util.*;

/**
 * <p>Description: </p>
 * <p></p>
 * <p>Copyright (c) 2020</p>
 * @Date 2022/7/2
 * @author biaoping.yin
 * @version 1.0
 */
public class HttpApi {

	public static void main(String[] args){
		System.out.println(51000 / 50);
	}

	/**
	 * 分页http服务
	 * @return
	 */
	public @ResponseBody
	List<Map> getPagineData(@RequestBody ApiBean apiBean){
//		ApiBean apiBean = SimpleStringUtil.json2Object(parmas,ApiBean.class);

		List<Map> datas =  new ArrayList<>();
		if(apiBean.getFrom() > 0 && (apiBean.getFrom() / apiBean.getSize()) == 10)
			return datas;
		for(int i = 0; i < apiBean.getSize(); i ++){
			Map data = new LinkedHashMap();
			data.put("name","jack-" + apiBean.getFrom());
			data.put("logTime",new Date());
			data.put("oldLogTimeEndTime",apiBean.getLogTimeEndTime());
			data.put("oldLogTime",apiBean.getLogTime());
			data.put("otherParam", apiBean.getOtherParam());
			data.put("title","马来西亚羽毛球公开赛16进8赛果-" + apiBean.getFrom());
			data.put("log_id", SimpleStringUtil.getUUID());
			datas.add(data);
		}
		return datas;
	}

	/**
	 * 分页http服务
	 * @return
	 */
	public @ResponseBody
	List<Map> getData(@RequestBody ApiBean apiBean){
//		ApiBean apiBean = SimpleStringUtil.json2Object(parmas,ApiBean.class);

		List<Map> datas =  new ArrayList<>();
		for(int i = 0; i < 100; i ++){
			Map data = new LinkedHashMap();
			data.put("name","jack-" + apiBean.getFrom());
			data.put("logTime",new Date());
			data.put("oldLogTimeEndTime",apiBean.getLogTimeEndTime());
			data.put("oldLogTime",apiBean.getLogTime());
			data.put("otherParam", apiBean.getOtherParam());
			data.put("title","马来西亚羽毛球公开赛16进8赛果-" + apiBean.getFrom());
			data.put("log_id", SimpleStringUtil.getUUID());
			datas.add(data);
		}
		return datas;
	}
}
