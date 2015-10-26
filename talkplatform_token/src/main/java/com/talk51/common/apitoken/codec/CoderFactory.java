package com.talk51.common.apitoken.codec;

import java.util.Map;

/**
 * 支持md5和sha两种加密方式
 * @author cailin
 *
 */
public class CoderFactory {

    public static String digest(String key, Map<String, ?> map,String codec) {
    	
    	String codeData= "";
    	if("md5".equalsIgnoreCase(codec)){
    		codeData =  HmacSHA256Utils.digest(key, map);
    		
    	}else if("sha".equalsIgnoreCase(codec)){
    		codeData =  Md5Encrypt.md5(key, map);
    	}
    	return codeData;
    	
    }
}
