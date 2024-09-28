package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.domain.Expense;
import com.all_live_young_wms_local.web.dto.ExpenseRequestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ExpenseMapper {
    List<Expense> findAll(@Param("requestDTO") ExpenseRequestDTO requestDTO);

    Optional<Expense> findById(@Param("id") Long id);

    Long save(@Param("expense") Expense expense);

    Integer count(@Param("requestDTO") ExpenseRequestDTO requestDTO);
}