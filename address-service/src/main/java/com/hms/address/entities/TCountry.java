package com.hms.address.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "t_countries")
public class TCountry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "\"isoCode\"", nullable = false, length = 2)
    private String isoCode;

    @Column(name = "\"e164Code\"", nullable = false, length = 4)
    private String e164Code;

    @Column(name = "\"iso3Code\"", nullable = false, length = 3)
    private String iso3Code;

    @Column(name = "capital")
    private String capital;

    @Column(name = "ccy")
    private String ccy;

    @Column(name = "\"ccyCode\"", length = 3)
    private String ccyCode;

    @Column(name = "population")
    private Integer population;

    @Column(name = "area")
    private Float area;

}