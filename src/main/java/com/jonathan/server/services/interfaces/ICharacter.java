package com.jonathan.server.services.interfaces;

import com.jonathan.server.domain.Character;

import java.util.Optional;

public interface ICharacter {

    public Iterable<Character> getAll();

    public Optional<Character> getOne(Integer id);

    public String charName(Integer id);


}
