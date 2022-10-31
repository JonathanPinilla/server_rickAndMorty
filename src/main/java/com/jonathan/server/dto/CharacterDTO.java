package com.jonathan.server.dto;

import com.jonathan.server.entity.CharactersEntity;
import lombok.Data;

import java.util.List;


@Data
public class CharacterDTO {

    private InfoDto info;
    private List<CharactersEntity> results;



    public CharacterDTO(InfoDto info, List<CharactersEntity> results) {
        this.info = info;
        this.results = results;
    }
}
