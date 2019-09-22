package com.ziw.demo0921.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/demoData")
    public String demoData(HttpServletRequest request, HttpServletResponse response){

        JSONArray array = new JSONArray();

        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("id", "1");
        jsonObject.put("setup", "setup");
        jsonObject.put("punchline", "punchline");


        array.add(jsonObject);

        return jsonObject.toJSONString();
    }
}
