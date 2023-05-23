package edu.vibatista.primeiroprojetospringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    public String nome;

}
