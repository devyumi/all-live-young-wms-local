package com.all_live_young_wms_local.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InboundRequestProduct {

    private Long id;
    @NumberFormat(pattern = "#,###")
    private Integer palletQuantity;

    @NumberFormat(pattern = "#,###")
    private Integer boxQuantity;
    private String manufactureNumber;


    @DateTimeFormat(pattern = "yyyy. MM. dd. a hh:mm")
    private LocalDateTime expirationDate;

    private InboundRequest inboundRequest;
    private Product product;


}
