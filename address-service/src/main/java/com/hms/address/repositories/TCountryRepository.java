package com.hms.address.repositories;

import com.hms.address.entities.TCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TCountryRepository extends JpaRepository<TCountry, Long> {
}