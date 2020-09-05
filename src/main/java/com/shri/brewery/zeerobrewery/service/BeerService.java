/*******************************************************************************
 * Created by  ZeeroIQ on $today.date.
 ******************************************************************************/

package com.shri.brewery.zeerobrewery.service;

import com.shri.brewery.zeerobrewery.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
