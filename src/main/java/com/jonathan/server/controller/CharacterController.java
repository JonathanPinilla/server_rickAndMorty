package com.jonathan.server.controller;

import com.jonathan.server.domain.Character;
import com.jonathan.server.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "crud")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping(path = "/")
    public List<Character> getCharacters() {
        return characterService.getAll();
    }

    @GetMapping(path = "/{id}")
    public String getOneCharacter(@PathVariable Integer id){
        return characterService.charName(id);
    }


}
