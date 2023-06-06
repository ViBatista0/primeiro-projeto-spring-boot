package edu.vibatista.primeiroprojetospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.vibatista.primeiroprojetospringboot.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
    
}
