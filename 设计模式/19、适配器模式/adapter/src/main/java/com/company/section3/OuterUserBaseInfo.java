package com.company.section3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {

	/* 
	 * 用户的基本信息
	 */
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		
		baseInfoMap.put("userName", "这个员工叫混世魔王....");
		baseInfoMap.put("mobileNumber", "这个员工电话是....");
		
		return baseInfoMap;
	}

}
