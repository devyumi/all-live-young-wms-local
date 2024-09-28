package com.all_live_young_wms_local.service;

import com.all_live_young_wms_local.domain.Sales;
import com.all_live_young_wms_local.mapper.SalesMapper;
import com.all_live_young_wms_local.web.dto.SalesRequestDTO;
import com.all_live_young_wms_local.web.dto.SalesResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SalesService {

    private final SalesMapper salesMapper;

    /**
     * 매출 전체 항목 조회
     *
     * @param salesRequestDTO
     * @return
     */
    @Transactional(readOnly = true)
    public SalesResponseDTO findSales(SalesRequestDTO salesRequestDTO) {
        return SalesResponseDTO.builder()
                .salesRequestDTO(salesRequestDTO)
                .sales(salesMapper.findAll(salesRequestDTO))
                .total(salesMapper.count(salesRequestDTO))
                .build();
    }

    /**
     * 매출 단일 항목 조회
     *
     * @param id
     * @return
     */
    @Transactional(readOnly = true)
    public Sales findSales(Long id) {
        return salesMapper.findById(id).orElseThrow(() -> new IllegalArgumentException("잘못된 id 값입니다."));
    }
}