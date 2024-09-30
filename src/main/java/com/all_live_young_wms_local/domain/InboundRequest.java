package com.all_live_young_wms_local.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InboundRequest {

    private Long id;
    private String inboundRequestCode;
    private Member member;
    private Warehouse warehouse;
    private String requestStatus;

    @DateTimeFormat(pattern =  "yyyy-MM-dd hh:mm")
    private LocalDateTime regDate;

    @DateTimeFormat(pattern =  "yyyy-MM-dd hh:mm")
    private LocalDateTime modDate;


}
