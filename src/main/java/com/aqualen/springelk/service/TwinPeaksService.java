package com.aqualen.springelk.service;

import com.aqualen.springelk.entity.TwinPeaksQuote;
import com.aqualen.springelk.repository.TwinPeaksRepository;
import com.github.javafaker.Faker;
import com.github.javafaker.TwinPeaks;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TwinPeaksService {

  private final TwinPeaksRepository twinPeaksRepository;

  public List<TwinPeaksQuote> findAll() {
    log.info("Getting all data from elastic search.");
    return twinPeaksRepository.findAll();
  }

  public List<TwinPeaksQuote> findByCharacter(String character) {
    log.info("Getting all data from elastic search from character: {}", character);
    return twinPeaksRepository.findByCharacter(character);
  }

  public TwinPeaksQuote save() {
    TwinPeaksQuote twinPeaksQuote = generate();
    log.info("Saving quote: {}", twinPeaksQuote);
    return twinPeaksRepository.save(twinPeaksQuote);
  }

  private TwinPeaksQuote generate() {
    TwinPeaks twinPeaks = new Faker().twinPeaks();
    return TwinPeaksQuote.builder()
        .quote(twinPeaks.quote())
        .character(twinPeaks.character())
        .location(twinPeaks.location()).build();
  }
}
