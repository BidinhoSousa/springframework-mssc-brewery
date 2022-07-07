package davhenriques.spring.msscbrewery.service;

import davhenriques.spring.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by DavHenriques on 07/07/2022
 */

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
