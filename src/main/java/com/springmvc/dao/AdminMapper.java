package com.springmvc.dao;

import com.springmvc.pojo.Admin;

/**
 * Created by 吕 on 2018/4/9.
 */
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
