package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.domain.Member;
import com.all_live_young_wms_local.domain.Sales;
import com.all_live_young_wms_local.web.dto.SalesRequestDTO;
import com.all_live_young_wms_local.web.dto.SumSalesDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface SalesMapper {
    List<Sales> findAll(@Param("requestDTO") SalesRequestDTO requestDTO, @Param("member") Member member);

    Optional<Sales> findById(@Param("id") Long id);

    Long save(@Param("sales") Sales sales);

    void update(@Param("sales") Sales sales);

    void delete(@Param("id") Long id);

    Integer count(@Param("requestDTO") SalesRequestDTO requestDTO, @Param("member") Member member);

    List<SumSalesDTO> findSumSales(Integer year);
}