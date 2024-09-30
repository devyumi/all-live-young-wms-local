package com.all_live_young_wms_local.service;

import com.all_live_young_wms_local.mapper.InboundRequestMapper;
import com.all_live_young_wms_local.web.dto.CountRequestDTO;
import com.all_live_young_wms_local.web.dto.CountStockDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InboundRequestService {

    private final InboundRequestMapper inboundRequestMapper;

    @Transactional(readOnly = true)
    public Integer getCount(String status) {
        return inboundRequestMapper.countByStatus(status);
    }

    @Transactional(readOnly = true)
    public List<CountRequestDTO> findCountInbound(Integer year) {
        return inboundRequestMapper.findCountInbound(year);
    }

    @Transactional(readOnly = true)
    public List<CountStockDTO> findCountStock(Integer year){
        return inboundRequestMapper.findCountStock(year);
    }
}
