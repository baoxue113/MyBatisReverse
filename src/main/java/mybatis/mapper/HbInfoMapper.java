package main.java.mybatis.mapper;

import java.util.List;
import main.java.mybatis.model.HbInfo;

public interface HbInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HbInfo record);

    HbInfo selectByPrimaryKey(Integer id);

    List<HbInfo> selectAll();

    int updateByPrimaryKey(HbInfo record);
}