package com.hms.address.services.impl;

import com.hms.address.entities.TCountry;
import com.hms.address.repositories.TCountryRepository;
import com.hms.address.services.CountryService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Function;

@Service("CountryServiceImpl")
public class CountryServiceImpl implements CountryService {

    private TCountryRepository tCountryRepository;

    public CountryServiceImpl(TCountryRepository tCountryRepository) {
        this.tCountryRepository = tCountryRepository;
    }

    Function<TCountry, TCountry> save = tCountry -> tCountryRepository.save(tCountry);
    Function<Long, Optional<TCountry>> findById = id -> tCountryRepository.findById(id);

    @Override
    public TCountry save(TCountry tCountry) {
        return save.apply(tCountry);
    }
}
