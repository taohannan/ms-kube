package com.example.cards.repository;

import com.example.cards.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepository extends JpaRepository<Cards,Long> {

    List<Cards> findByCustomerId(int customerId);
}
