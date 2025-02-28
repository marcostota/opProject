package com.marcostota.study.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcostota.study.entity.Characterop;

@Repository
public interface CharacteropRepository extends JpaRepository<Characterop, Long> {

	Optional<Characterop> findByEmail(String email);
}
