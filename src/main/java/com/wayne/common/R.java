package com.wayne.common;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wayne
 * @date 2019.07.23
 */
public class R extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    private R() {
        put("code", HttpStatus.OK.value());
        put("success", Boolean.TRUE);
        put("message", "success");
    }


    public static R error() {
        return error("未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("success", Boolean.FALSE);
        r.put("message", msg);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("message", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }



}
