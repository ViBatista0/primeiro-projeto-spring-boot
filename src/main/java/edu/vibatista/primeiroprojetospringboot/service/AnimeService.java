package edu.vibatista.primeiroprojetospringboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import edu.vibatista.primeiroprojetospringboot.domain.Anime;

@Service
public class AnimeService {

    private static List<Anime> animes;

    static {
        animes = new ArrayList<>(List.of(new Anime(1L, "Death Parade"), new Anime(2L, "Shigatsu wa Kimi no Uso")));
    }

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findByid(long id) {
        return animes.stream().filter(anime -> anime.getId().equals(id)).findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found "));
    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3, 100000));
        animes.add(anime);
        return anime;
    }

    public void delete(long id) {
        animes.remove(findByid(id));
    }

    public void replace(Anime anime) {
        delete(anime.getId());
        animes.add(anime);
    }
}
