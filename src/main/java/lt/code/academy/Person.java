package lt.code.academy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
record Person (
//public class Person implements Serializable {
    /*    private  final String name;
        private final String surname;



        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;

        }*/
    @JsonProperty("name")
    String name,
    @JsonProperty("surname")
    String surname
    //}
)
{

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

/*import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

record User(
		@JsonProperty("netikrasVardas")
		String name,
		@JsonProperty("kitaPavarde")
		String surname,
		String email,
		int age,
		//@JsonIgnore
		List<Address> addresses
) {


}*/



