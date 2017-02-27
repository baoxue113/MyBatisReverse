package main.java.mybatis.mapper;

import java.util.List;
import main.java.mybatis.model.QhbInf;
import main.java.mybatis.model.QhbInfExample;
import org.apache.ibatis.annotations.Param;

public interface QhbInfMapper {
    int countByExample(QhbInfExample example);

    int deleteByExample(QhbInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QhbInf record);

    int insertSelective(QhbInf record);

    List<QhbInf> selectByExample(QhbInfExample example);

    QhbInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QhbInf record, @Param("example") QhbInfExample example);

    int updateByExample(@Param("record") QhbInf record, @Param("example") QhbInfExample example);

    int updateByPrimaryKeySelective(QhbInf record);

    int updateByPrimaryKey(QhbInf record);
}