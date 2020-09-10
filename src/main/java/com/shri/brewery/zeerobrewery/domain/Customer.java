package com.shri.brewery.zeerobrewery.domain;

/*
 * Created by  ZeeroIQ on 9/10/20, 10:34 PM
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {

    private UUID id;
    private String name;

}