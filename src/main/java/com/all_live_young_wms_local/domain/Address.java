package com.all_live_young_wms_local.domain;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String roadAddress;
    private String jibunAddress;
    private String zipCode;
    private String detailsAddress;
}
