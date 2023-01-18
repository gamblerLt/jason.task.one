package lt.code.academy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Person implements Serializable {
    private  final String name;
    private final String surname;



    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
/*    @JsonProperty("name")
    String name,
    @JsonProperty("surname")
    String surname;
    to be deleted*/




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}




