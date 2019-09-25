package com.ziw.demo0921.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("book")
public class BookEntity {


    @TableId(type = IdType.AUTO)
    private Long id;


    /**
     * 姓名
     */
    private String name;


    private String author;


    private Integer price;

}
