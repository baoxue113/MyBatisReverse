package main.java.mybatis.mapper;

import java.util.List;
import main.java.mybatis.model.HbBalance;

public interface HbBalanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HbBalance record);

    HbBalance selectByPrimaryKey(Integer id);

    List<HbBalance> selectAll();

    int updateByPrimaryKey(HbBalance record);
}