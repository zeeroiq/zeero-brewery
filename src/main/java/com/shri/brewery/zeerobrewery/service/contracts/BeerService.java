package com.shri.brewery.zeerobrewery.service.contracts;

import com.shri.brewery.zeerobrewery.model.BeerDto;

import java.util.UUID;

/*
 * Created by  ZeeroIQ on 9/5/20, 12:35 PM
 */

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
