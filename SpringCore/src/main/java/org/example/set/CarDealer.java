package org.example.set;

import java.util.Set;

public class CarDealer {
    private String name;
    private Set<String> models;

    public CarDealer() {

    }
    public CarDealer(Set<String> models, String name) {
        this.models = models;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getModels() {
        return models;
    }

    public void setModels(Set<String> models) {
        this.models = models;
    }
}
