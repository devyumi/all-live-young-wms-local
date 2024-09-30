package com.all_live_young_wms_local.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pallet {

    private Long id;
    private InboundRequestProduct inboundRequestProduct;
    private Section section;

}
