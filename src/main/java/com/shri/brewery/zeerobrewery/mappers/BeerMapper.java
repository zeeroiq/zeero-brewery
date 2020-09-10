package com.shri.brewery.zeerobrewery.mappers;

import com.shri.brewery.zeerobrewery.domain.Beer;
import com.shri.brewery.zeerobrewery.model.BeerDto;
import org.mapstruct.Mapper;

/*
 * Created by  ZeeroIQ on 9/10/20, 10:35 PM
 */
@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
