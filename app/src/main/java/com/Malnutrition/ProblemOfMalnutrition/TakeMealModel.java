package com.Malnutrition.ProblemOfMalnutrition;

public class TakeMealModel  {

    private String meal_name,meal_img,key;

    // All In Gram
    // Energy in KCAL
    private Double components;
    private Double energy;
    private Double carbohydrates;
    private Double fats;
    private Double proteins;
    private Double water;
    private Double sugar;
    private Double callories;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getCallories() {
        return callories;
    }

    public void setCallories(Double callories) {
        this.callories = callories;
    }

    public String getMeal_img() {
        return meal_img;
    }

    public void setMeal_img(String meal_img) {
        this.meal_img = meal_img;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    public Double getComponents() {
        return components;
    }

    public void setComponents(Double components) {
        this.components = components;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public Double getProteins() {
        return proteins;
    }

    public void setProteins(Double proteins) {
        this.proteins = proteins;
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getSugar() {
        return sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }
}
