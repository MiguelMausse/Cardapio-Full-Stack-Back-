package com.miguelapp.Cardapp.Repositorio;

import com.miguelapp.Cardapp.Entity.Food;

public record FoodResponseDTO(Long Id, String image, Integer price, String title){
    public  FoodResponseDTO(Food food){
        this(food.getId(), food.getImage(), food.getPrice(), food.getTitle());
    }
}
