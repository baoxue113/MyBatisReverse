package main.java.mybatis.mapper;

import java.util.List;
import main.java.mybatis.model.HbBalance;
import main.java.mybatis.model.HbBalanceExample;
import org.apache.ibatis.annotations.Param;

public interface HbBalanceMapper {
    int countByExample(HbBalanceExample example);

    int deleteByExample(HbBalanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HbBalance record);

    int insertSelective(HbBalance record);

    List<HbBalance> selectByExample(HbBalanceExample example);

    HbBalance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HbBalance record, @Param("example") HbBalanceExample example);

    int updateByExample(@Param("record") HbBalance record, @Param("example") HbBalanceExample example);

    int updateByPrimaryKeySelective(HbBalance record);

    int updateByPrimaryKey(HbBalance record);
}