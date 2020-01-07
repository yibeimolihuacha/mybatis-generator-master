package com.aaa.lzh.mybatis.mapper;

import com.aaa.lzh.mybatis.model.Book;
import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    Book selectByPrimaryKey(Integer id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}