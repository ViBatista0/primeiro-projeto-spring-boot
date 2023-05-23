package edu.vibatista.primeiroprojetospringboot.repository;

import java.util.List;

import edu.vibatista.primeiroprojetospringboot.domain.Anime;

public interface AnimeRepository {
    List<Anime> listAll();
}
