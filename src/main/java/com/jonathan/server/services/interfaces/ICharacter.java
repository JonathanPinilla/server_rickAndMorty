package com.jonathan.server.services.interfaces;


import com.jonathan.server.dto.CharacterDTO;

public interface ICharacter {

    public CharacterDTO getAll(Integer page);

    public String getOne(Integer id);

    public String charName(Integer id);

}
