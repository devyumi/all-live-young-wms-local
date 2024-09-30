package com.all_live_young_wms_local.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OutboundRequest {

    private Long id;
    private String code;
    private String status;
    private Member member;
    private Stock stock;
    private Integer quantity;
    private String recipientName;
    private Address address;
    private String recipientContact;
    private Boolean isFault;
    private String rejectionNote;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private String note;
}
