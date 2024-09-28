package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.domain.Sales;
import com.all_live_young_wms_local.web.dto.SalesRequestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface SalesMapper {
    List<Sales> findAll(@Param("requestDTO") SalesRequestDTO requestDTO);

    Optional<Sales> findById(@Param("id") Long id);

    Long save(@Param("sales") Sales sales);

    Integer count(@Param("requestDTO") SalesRequestDTO requestDTO);

}