package org.example.dependencycheck;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public class Prescription {
    //@NotNull should not be used on fields used in setter methods
    @NotNull  //before Spring6 it is @required
    private int id;
    private String name;
    private List<String> med;

    public Prescription() {
    }
    public Prescription(int id, String name, List<String> med) {
        this.id = id;
        this.name = name;
        this.med = med;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", med=" + med +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMed() {
        return med;
    }

    public void setMed(List<String> med) {
        this.med = med;
    }
}


//org.springframework.core.SpringProperties.checkFlag(String)  --> dependency error in version of springFramework