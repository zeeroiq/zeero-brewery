/*******************************************************************************
 * Created by  ZeeroIQ.
 ******************************************************************************/

package com.shri.brewery.zeerobrewery.service;

import com.shri.brewery.zeerobrewery.model.BeerDto;
import com.shri.brewery.zeerobrewery.service.contracts.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {


    @Override
    public BeerDto getBeerById(UUID beerId) {

        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Corona")
                .beerStyle("Strong")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        log.info("Item saved");

        return beerDto;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.info("Updating beer");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.info("Deleting beer");
    }
}
