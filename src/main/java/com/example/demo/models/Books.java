package com.example.demo.models;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Books {
    @NonNull
    private int id;
    public String mark;
    public String model;
    public String color;
    private int cost;
}
