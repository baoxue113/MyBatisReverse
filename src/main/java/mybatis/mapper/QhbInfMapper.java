package main.java.mybatis.mapper;

import java.util.List;
import main.java.mybatis.model.QhbInf;

public interface QhbInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QhbInf record);

    QhbInf selectByPrimaryKey(Integer id);

    List<QhbInf> selectAll();

    int updateByPrimaryKey(QhbInf record);
}