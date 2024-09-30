package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.web.dto.CountRequestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OutboundRequestMapper {

    Integer countByStatus(String status);

    List<CountRequestDTO> findCountOutbound(Integer year);
}
