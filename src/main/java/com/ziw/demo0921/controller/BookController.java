package com.ziw.demo0921.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ziw.demo0921.entity.BookEntity;
import com.ziw.demo0921.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 书籍列表
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/list")
    public String list(HttpServletRequest request, HttpServletResponse response){

        QueryWrapper<BookEntity> bookQueryWrapper = new QueryWrapper<>();
        bookQueryWrapper.lambda().orderByDesc(BookEntity::getId);
        List<BookEntity> list = bookService.list(bookQueryWrapper);
        return JSON.toJSONString(list);
    }

    /**
     * 新增书籍
     * @param name
     * @param author
     * @param price
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/add")
    public String add(String name, String author, Integer price, HttpServletRequest request, HttpServletResponse response){

        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(name);
        bookEntity.setAuthor(author);
        bookEntity.setPrice(price);
        boolean save = bookService.save(bookEntity);

        System.out.println(save);
        System.out.println(bookEntity.getId());

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "88ufs");

        return jsonObject.toJSONString();
    }


    /*@GetMapping("/test")
    public String test(String name, String author, String price, HttpServletRequest request, HttpServletResponse response){

        for (int i=1; i<=160; i++){
            BookEntity bookEntity = new BookEntity();
            bookEntity.setName("美丽新世界第" + i + "部");
            bookEntity.setAuthor("小明");
            bookEntity.setPrice(i);
            bookService.save(bookEntity);
        }




        return "123";
    }*/





    @GetMapping("/init")
    public String init(HttpServletRequest request, HttpServletResponse response){


        return "init success.";
    }
}
