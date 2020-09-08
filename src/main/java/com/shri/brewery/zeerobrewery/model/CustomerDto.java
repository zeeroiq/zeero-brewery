/*******************************************************************************
 * Created by  ZeeroIQ.
 ******************************************************************************/

package com.shri.brewery.zeerobrewery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto implements Serializable {

    private UUID id;
    @NotNull
    @Size(min = 3, max = 100)
    private String name;

}
