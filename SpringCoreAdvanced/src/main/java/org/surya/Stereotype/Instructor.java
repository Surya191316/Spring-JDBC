package org.surya.Stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Component("bean-name")
//that beam should be = the name given in xml
@Scope("prototype")
//u cannot use @scope alone, only used alone with other stereotype annotations only
public class Instructor {
    //this @value will override any value that we assign for that id
    @Value("10")
    private int id;
    @Value("Surya")
    private String name;
    @Value("#{skills}")
    private List<String> skills;
    @Autowired
    private Resume resume;

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", resume=" + resume +
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
}
