package com.example.tomato.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//never use @data with entities

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private String name;
    private int price;
    private String description;
    private boolean isVeg;
}
