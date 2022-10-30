package com.jonathan.server.repository;

import com.jonathan.server.domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {

    @Query("SELECT c.episode FROM Character c WHERE c.id = 1")
    public String selectName(Integer id);
}
