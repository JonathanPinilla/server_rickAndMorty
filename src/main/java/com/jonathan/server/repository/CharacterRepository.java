package com.jonathan.server.repository;

import com.jonathan.server.entity.CharactersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<CharactersEntity, Integer> {

    @Query(nativeQuery = true, value = "SELECT name FROM characters WHERE id = :givenId")
    public String selectName(@Param("givenId") Integer givenId);

    @Query(nativeQuery = true, value = "SELECT * FROM characters LIMIT 20 OFFSET :page * 20")
    public List<CharactersEntity> selectAll(@Param("page") Integer page);

}
