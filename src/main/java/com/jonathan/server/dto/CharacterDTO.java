package com.jonathan.server.dto;

import com.jonathan.server.entity.CharactersEntity;
import lombok.Data;

import java.util.List;


@Data
public class CharacterDTO {

    private List<CharactersEntity> results;

    private List<Integer> info;
}
