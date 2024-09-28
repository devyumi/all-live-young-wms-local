package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.domain.Expense;
import com.all_live_young_wms_local.web.dto.ExpenseRequestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExpenseMapper {
    List<Expense> findAll(@Param("requestDTO") ExpenseRequestDTO requestDTO);

    Integer count(@Param("requestDTO") ExpenseRequestDTO requestDTO);
}