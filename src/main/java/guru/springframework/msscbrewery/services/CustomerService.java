package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;

/**
 * Practice SpringMVC with Customer service
 */
public interface CustomerService {

CustomerDto getCustomerById(UUID customerId);
}
