package com.hjc.demo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class RpcUploadServiceImpl implements RpcUploadService {

    public Map<String, Object>IrrigatedArea(String code, String msg) {
        try {
            JSONObject jsonObj = (JSONObject)(new JSONParser().parse(msg));
            System.out.println(jsonObj.get("skills") + "\n" + jsonObj.get("skills").getClass());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", "success");
        return result;
    }
}