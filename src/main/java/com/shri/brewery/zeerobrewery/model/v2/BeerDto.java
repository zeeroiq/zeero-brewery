package com.shri.brewery.zeerobrewery.model.v2;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto implements Serializable {

    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotBlank
    private BeerStyleDto beerStyle;
    @Positive
    private Long utc;

}
