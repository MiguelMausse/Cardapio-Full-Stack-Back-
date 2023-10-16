package com.miguelapp.Cardapp.Controller;

import com.miguelapp.Cardapp.Entity.Food;
import com.miguelapp.Cardapp.Repositorio.FoodRepository;
import com.miguelapp.Cardapp.Repositorio.FoodRequestDTO;
import com.miguelapp.Cardapp.Repositorio.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Food")

public class FoodController{


    @Autowired
    private FoodRepository repository;

     @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping()
    public void saveFood(@RequestBody FoodRequestDTO dados){
        Food foodDate= new Food(dados);
        repository.save(foodDate);

    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList =  repository.findAll().stream().map(FoodResponseDTO::new).toList();
          return foodList;
    }

}
