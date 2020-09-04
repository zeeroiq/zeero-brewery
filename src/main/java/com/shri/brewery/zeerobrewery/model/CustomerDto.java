/*******************************************************************************
 * Created by  ZeeroIQ on $today.date.
 ******************************************************************************/

package com.shri.brewery.zeerobrewery.model;

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
public class CustomerDto implements Serializable {

    private UUID id;
    private String name;

}
