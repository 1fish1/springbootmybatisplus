package com.yy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.pojo.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

@Repository
public interface UserMapper  extends BaseMapper<User> {
}
