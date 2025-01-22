package com.abhi.journalapplication.util.helper;

import java.util.HashMap;
import java.util.Map;

public class ResBuild {
    public static Map<String, Object> buildRes(String status, String message){
        Map<String, Object> response = new HashMap<>();
        response.put("response", status);
        response.put("message", message);
        return response;
    }

    public static Map<String, Object> buildRes(String status, String message, Object data){
        Map<String, Object> response = new HashMap<>();
        response.put("response", status);
        response.put("message", message);
        response.put("data", data);
        return response;
    }
}
