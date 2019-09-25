package com.ziw.demo0921.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziw.demo0921.dao.BookDao;
import com.ziw.demo0921.entity.BookEntity;
import com.ziw.demo0921.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl extends ServiceImpl<BookDao, BookEntity> implements BookService {
}
