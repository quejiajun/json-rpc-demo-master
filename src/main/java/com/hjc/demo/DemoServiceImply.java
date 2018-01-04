package com.hjc.demo;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class DemoServiceImply implements DemoService {

    public DemoBean getDemo(String code, String msg) {
        System.out.println(msg + "\n" + msg.getClass());
        try {
            JSONObject jsonObj = (JSONObject)(new JSONParser().parse(msg));
            System.out.println(jsonObj.get("skills") + "\n" + jsonObj.get("skills").getClass());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DemoBean bean1 = new DemoBean();
        bean1.setCode(Integer.parseInt(code));
        bean1.setMsg("success");
        return bean1;
    }
}