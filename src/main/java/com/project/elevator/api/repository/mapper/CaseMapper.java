package com.project.elevator.api.repository.mapper;

import com.project.elevator.api.model.Case;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CaseMapper {
    @Select("SELECT JSON FROM CASES WHERE ID=#{id}")
    String getJsonById(@Param("id") int id);
}
