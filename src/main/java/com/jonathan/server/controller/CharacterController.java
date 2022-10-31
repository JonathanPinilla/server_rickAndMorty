package com.jonathan.server.controller;

import com.jonathan.server.entity.CharactersEntity;
import com.jonathan.server.services.CharacterService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "crud")
public class CharacterController {



    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping(path = "/characters/")
    public List<CharactersEntity> getCharacters(@RequestParam Integer page) {
        return characterService.getAll(page);
    }

    @GetMapping(path = "/{id}")
    public String getOneCharacter(@PathVariable Integer id){
        String data = characterService.getOne(id);
        return data;
    }

}
