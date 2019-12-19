package com.project.elevator.api.utils;

import com.google.gson.Gson;

import java.util.Map;

public class JsonStringConverterUtil {
    public static Map jsonStringConverter(String json){
        Gson gson = new Gson();
        Map map=gson.fromJson(json, Map.class);
        return map;
    }
}
