package com.all_live_young_wms_local.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NetProfitDTO {

    private Integer year;
    private Integer netProfit;
}
