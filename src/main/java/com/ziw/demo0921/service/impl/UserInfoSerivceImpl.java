package com.ziw.demo0921.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziw.demo0921.dao.UserInfoDao;
import com.ziw.demo0921.entity.UserInfoEntity;
import com.ziw.demo0921.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoSerivceImpl extends ServiceImpl<UserInfoDao, UserInfoEntity> implements UserInfoService {
}

