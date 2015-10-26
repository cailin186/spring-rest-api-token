package com.talk51.common.apitoken.util;

public class StringUtils {
	public static boolean isEmpty(String value) {
		if (value == null || value.trim().isEmpty()) {
			return true;
		}
		return false;
	}
}
