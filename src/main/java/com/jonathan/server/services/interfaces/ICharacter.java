package com.jonathan.server.services.interfaces;


import com.jonathan.server.entity.CharactersEntity;

import java.util.List;
import java.util.Optional;

public interface ICharacter {

    public List<CharactersEntity> getAll(Integer page);

    public String getOne(Integer id);

    public String charName(Integer id);

}
