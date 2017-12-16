package com.github.marsor707.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
public class CookieUtil {

    /**
     * 设置cookie
     *
     * @param response
     * @param name
     * @param value
     * @param maxAge
     */
    public static void set(HttpServletResponse response,
                           String name,
                           String value,
                           int maxAge) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(maxAge);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    public static void get() {

    }
}
