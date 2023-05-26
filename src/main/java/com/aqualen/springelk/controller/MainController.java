package com.aqualen.springelk.controller;

import com.aqualen.springelk.service.TwinPeaksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("twin-peaks")
@RequiredArgsConstructor
public class MainController {

  private final TwinPeaksService twinPicksService;

  @PostMapping
  public String save() {
    return twinPicksService.save().toString();
  }

  @GetMapping
  public String findAll() {
    return twinPicksService.findAll().toString();
  }

  @GetMapping("{character}")
  public String findByCharacter(@PathVariable String character) {
    return twinPicksService.findByCharacter(character).toString();
  }
}
