package com.example.demo.domain;

import java.io.Serializable;
import java.util.List;

public class JsonData implements Serializable {
    private static final long serialVersionUID = 1L;

    //状态码 0表示成功，-1表示失败
    private int code;

    //结果
    private Object data;

    //错误描述
    private String message;

    public static JsonData buildSuccess() {
        return new JsonData(0,null,null);
    }
    public static JsonData buildSuccess(Object data) {
        return new JsonData(0,data,null);
    }
    public static JsonData buildSuccess(String msg) {
        return new JsonData(-1,null,msg);
    }
    public static JsonData buildSuccess(String msg,int code) {
        return new JsonData(code,null,msg);
    }
    public static JsonData buildSuccess(Object data,String msg) {
        return new JsonData(0,data,msg);
    }
    public static JsonData buildSuccess(Object data,int code) {
        return new JsonData(code,data,null);
    }
    public static String buildSuccess(int id) {
        return "{code:0,data:"+id+",message:成功}";
    }

    public static String buildSuccess(List list) {
        return "{code:0,data:"+list+",message:成功}";
    }

    public static String buildSuccess(User2 user) {
        return "{code:0,data:"+user+",message:成功}";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonData(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
