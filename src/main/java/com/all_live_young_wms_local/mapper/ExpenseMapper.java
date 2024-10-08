package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.domain.Expense;
import com.all_live_young_wms_local.web.dto.ExpenseRequestDTO;
import com.all_live_young_wms_local.web.dto.NetProfitDTO;
import com.all_live_young_wms_local.web.dto.SumExpensesCategoryDTO;
import com.all_live_young_wms_local.web.dto.SumExpensesDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ExpenseMapper {
    List<Expense> findAll(ExpenseRequestDTO requestDTO, Long warehouse_id);

    Optional<Expense> findById(Long id);

    Long save(@Param("expense") Expense expense);

    void update(@Param("expense") Expense expense);

    void delete(Long id);

    Integer count(ExpenseRequestDTO requestDTO, Long warehouse_id);

    List<SumExpensesDTO> findSumExpenses(Integer year);

    List<SumExpensesCategoryDTO> findSumExpensesCategory(Integer year);

    List<NetProfitDTO> findNetProfit();
}