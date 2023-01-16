package com.aqualen.springelk.repository;

import com.aqualen.springelk.entity.TwinPeaksQuote;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TwinPeaksRepository extends CrudRepository<TwinPeaksQuote, String> {
  List<TwinPeaksQuote> findByCharacter(String character);
  List<TwinPeaksQuote> findAll();
}
