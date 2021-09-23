package com.example.codex.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Breed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Type> typeList;

public Breed(){

}

    public Breed(String name, List<Type> typeList) {
        this.name = name;
        this.typeList = typeList;
    }

    public String getName(){
    return name;
    }

    public void setName(String name){
    this.name = name;
    }

    public List<Type> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<Type> typeList) {
        this.typeList = typeList;
    }
}
