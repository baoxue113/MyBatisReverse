package main.java.mybatis.mapper;

import java.util.List;
import main.java.mybatis.model.HbUserInfo;

public interface HbUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HbUserInfo record);

    HbUserInfo selectByPrimaryKey(Integer id);

    List<HbUserInfo> selectAll();

    int updateByPrimaryKey(HbUserInfo record);
}