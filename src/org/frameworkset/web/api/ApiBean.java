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

import org.frameworkset.util.annotations.RequestParam;

import java.util.Date;

/**
 * <p>Description: </p>
 * <p></p>
 * <p>Copyright (c) 2020</p>
 * @Date 2022/7/2
 * @author biaoping.yin
 * @version 1.0
 */
public class ApiBean {
	@RequestParam(dateformat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private Date logTime;
	@RequestParam(dateformat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private Date logTimeEndTime;
	private int from;
	private int size;
	private String otherParam;

    private boolean debugError;

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public Date getLogTimeEndTime() {
		return logTimeEndTime;
	}

	public void setLogTimeEndTime(Date logTimeEndTime) {
		this.logTimeEndTime = logTimeEndTime;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getOtherParam() {
		return otherParam;
	}

	public void setOtherParam(String otherParam) {
		this.otherParam = otherParam;
	}

    public boolean isDebugError() {
        return debugError;
    }

    public void setDebugError(boolean debugError) {
        this.debugError = debugError;
    }

}
