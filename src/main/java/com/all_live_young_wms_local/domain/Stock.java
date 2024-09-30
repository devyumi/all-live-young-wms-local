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
public class Stock {

    private Long id;
    private String stockCode;

    @DateTimeFormat(pattern =  "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime regDate;

    @DateTimeFormat(pattern =  "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime modDate;

    private Product product; // 상품명 , 회사명 , 유효기간 , 제조번호 , 보관온도 , 상품 종류 , 총 박스 수량 전부 Product 혹은 Product의 연관관계로 알 수 있음!

    private Warehouse warehouse; //창고명 , 창고주소

    private Pallet pallet;

}
