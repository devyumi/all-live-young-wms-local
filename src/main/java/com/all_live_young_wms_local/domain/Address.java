package com.all_live_young_wms_local.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String roadNameAddress;
    private String jibunAddress;
    private String zipCode;
    private String detailsAddress;
}
