package com.hms.address.services;

import com.hms.address.entities.TCountry;
import com.hms.address.repositories.TCountryRepository;

import java.util.function.Function;

/**
 * Country Service
 */
public interface CountryService {

    TCountry save(TCountry tCountry);

}
