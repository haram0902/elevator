package com.project.elevator.api.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserkeyMapper {
    @Select("SELECT JSON FROM CASES WHERE ID=#{id}")
    String getJsonById(@Param("id") int id);
}
