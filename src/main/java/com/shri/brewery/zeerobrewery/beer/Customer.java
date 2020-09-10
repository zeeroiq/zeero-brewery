package com.shri.brewery.zeerobrewery.beer;

/*
 * Created by  ZeeroIQ on 9/10/20, 10:34 PM
 */

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