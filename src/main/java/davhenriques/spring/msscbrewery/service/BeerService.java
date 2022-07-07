package davhenriques.spring.msscbrewery.service;

import davhenriques.spring.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by DavHenriques on 07/07/2022
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
