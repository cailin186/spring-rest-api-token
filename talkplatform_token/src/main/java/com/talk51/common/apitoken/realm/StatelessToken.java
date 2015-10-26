package com.talk51.common.apitoken.realm;

import org.apache.shiro.authc.AuthenticationToken;

import java.util.Map;


/**
 * 
 * @author cailin
 * @since 20151026
 *
 */
public class StatelessToken implements AuthenticationToken {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String appkey;
    private Map<String, ?> params;
    private String clientDigest;

    public StatelessToken(String appKey,  Map<String, ?> params, String clientDigest) {
        this.appkey = appKey;
        this.params = params;
        this.clientDigest = clientDigest;
    }

    public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public  Map<String, ?> getParams() {
        return params;
    }

    public void setParams( Map<String, ?> params) {
        this.params = params;
    }

    public String getClientDigest() {
        return clientDigest;
    }

    public void setClientDigest(String clientDigest) {
        this.clientDigest = clientDigest;
    }

	public Object getPrincipal() {
		 return appkey;
	}

	public Object getCredentials() {
		return clientDigest;
	}

}
