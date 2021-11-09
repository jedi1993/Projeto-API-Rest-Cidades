package com.example.demo.citiesapi.countries.repository;

import com.example.demo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
