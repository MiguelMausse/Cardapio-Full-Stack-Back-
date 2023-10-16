package com.miguelapp.Cardapp.Repositorio;

import com.miguelapp.Cardapp.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
