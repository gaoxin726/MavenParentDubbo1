package com.qphone.dao;

import com.qphone.pojo.Text;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TextDao {
     List<Text> getall();
}
