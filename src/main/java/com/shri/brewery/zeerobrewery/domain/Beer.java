package com.shri.brewery.zeerobrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/*
 * Created by  ZeeroIQ on 9/10/20, 10:31 PM
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Beer {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long utc;
}
