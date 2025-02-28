package com.marcostota.study.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcostota.study.dto.CharacterDTO;
import com.marcostota.study.entity.Characterop;
import com.marcostota.study.service.CharacteropService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/characters")
public class CharacteropController {

	private final CharacteropService characteropService;

	public CharacteropController(CharacteropService characteropService) {
		this.characteropService = characteropService;
	}

	@PostMapping
	public ResponseEntity<Map<String, Long>> createCharacters(@RequestBody @Valid CharacterDTO characterDTO) {

		Characterop savedCharacterop = characteropService.createCharacters(characterDTO);
		Map<String, Long> response = new HashMap<>();
		response.put("id", savedCharacterop.getId());
		return ResponseEntity.ok(response);
	}

}
