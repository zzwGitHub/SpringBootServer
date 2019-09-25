package com.ziw.demo0921.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/list")
    public String list(HttpServletRequest request, HttpServletResponse response){

        JSONArray array = new JSONArray();

        for(int i=1; i<=100; i++){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("key", i);
            jsonObject.put("name", "哈利波特" + i);
            jsonObject.put("author", "JK罗琳");
            jsonObject.put("price", "10" + i);
            array.add(jsonObject);
        }

        return array.toJSONString();
    }


    @GetMapping("/add")
    public String add(String name, String author, String price, HttpServletRequest request, HttpServletResponse response){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "88ufs");

        return jsonObject.toJSONString();
    }
}
