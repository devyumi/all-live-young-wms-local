package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.web.dto.CountRequestDTO;
import com.all_live_young_wms_local.web.dto.CountStockDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InboundRequestMapper {

    Integer countByStatus(String status);

    List<CountRequestDTO> findCountInbound(Integer year);

    List<CountStockDTO> findCountStock(Integer year);
}
