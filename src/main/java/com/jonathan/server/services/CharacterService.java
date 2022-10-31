package com.jonathan.server.services;

import com.jonathan.server.dto.CharacterDTO;
import com.jonathan.server.dto.InfoDto;
import com.jonathan.server.entity.CharactersEntity;
import com.jonathan.server.repository.CharacterRepository;
import com.jonathan.server.services.interfaces.ICharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService implements ICharacter {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public CharacterDTO getAll(Integer page) {
        Integer perPage = 20;
        Integer count = characterRepository.info();
        int pages = (int) Math.ceil(count.floatValue() / perPage.floatValue());

        InfoDto info = new InfoDto(count, pages);
        return new CharacterDTO(info, characterRepository.selectAll(page));
    }

    @Override
    public String getOne(Integer id) {
        return characterRepository.selectName(id);
    }

    @Override
    public String charName(Integer param_id){
        return characterRepository.selectName(param_id);
    }
}
