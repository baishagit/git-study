package com.baisha.mapper;

import com.baisha.pojo.Notebook;
import com.baisha.tkmybatis.TKMybatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NotebookMapper extends TKMybatis<Notebook> {
    int insert( Notebook notebook);
    void deleteById(Integer id);
    void update(Notebook notebook);

    @Override
    List<Notebook> selectAll();

    Notebook selectById(Integer id);

}