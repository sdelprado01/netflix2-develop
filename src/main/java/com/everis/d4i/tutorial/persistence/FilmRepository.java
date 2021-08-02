package com.everis.d4i.tutorial.persistence;

import com.everis.d4i.tutorial.persistence.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Long> {
}
