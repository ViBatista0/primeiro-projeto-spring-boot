package edu.vibatista.primeiroprojetospringboot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import edu.vibatista.primeiroprojetospringboot.domain.Anime;
import edu.vibatista.primeiroprojetospringboot.requests.AnimePostRequestBody;
import edu.vibatista.primeiroprojetospringboot.requests.AnimePutRequestBody;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
