package com.all_live_young_wms_local.service;

import com.all_live_young_wms_local.mapper.OutboundRequestMapper;
import com.all_live_young_wms_local.web.dto.CountRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OutboundRequestService {

    private final OutboundRequestMapper outboundRequestMapper;

    @Transactional(readOnly = true)
    public Integer getCount(String status) {
        return outboundRequestMapper.countByStatus(status);
    }

    @Transactional(readOnly = true)
    public List<CountRequestDTO> findCountOutbound(Integer year) {
        return outboundRequestMapper.findCountOutbound(year);
    }
}
