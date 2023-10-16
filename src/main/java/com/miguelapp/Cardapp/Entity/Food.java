package com.miguelapp.Cardapp.Entity;

import com.miguelapp.Cardapp.Repositorio.FoodRequestDTO;
import com.miguelapp.Cardapp.Repositorio.FoodResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "food")
@Table(name = "foodtable")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private  String image;

    private  Integer price;


    public Food(FoodRequestDTO dados) {
        this.image = dados.image();
        this.price = dados.price();
        this.title = dados.title();
      }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
