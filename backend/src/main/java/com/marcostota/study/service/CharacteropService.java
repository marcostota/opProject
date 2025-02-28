package com.marcostota.study.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marcostota.study.dto.CharacterDTO;
import com.marcostota.study.entity.Characterop;
import com.marcostota.study.repository.CharacteropRepository;

@Service
public class CharacteropService {

	private final CharacteropRepository characteropRepository;

	public CharacteropService(CharacteropRepository characteropRepository) {
		this.characteropRepository = characteropRepository;
	}

	public Characterop createCharacters(CharacterDTO characterDTO) {
		Optional<Characterop> saveCharacteropOpt = characteropRepository.findByEmail(characterDTO.email());

		if (saveCharacteropOpt.isPresent()) {
			// If character exists, update the existing record
			Characterop characterop = saveCharacteropOpt.get();
			characterop.setName(characterDTO.name());
			characterop.setAge(characterDTO.age());
			return characteropRepository.save(characterop);
		} else {
			// If character does not exist, create a new one
			Characterop newCharacterop = new Characterop();
			newCharacterop.setName(characterDTO.name());
			newCharacterop.setAge(characterDTO.age());
			newCharacterop.setEmail(characterDTO.email());
			return characteropRepository.save(newCharacterop);
		}
	}

}
