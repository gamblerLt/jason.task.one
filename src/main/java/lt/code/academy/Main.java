package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.core.type.TypeReference;


import java.io.*;
import java.util.List;
import  java.util.Map;

public class Main {
   // private static final String FILE_NAME = "my_task_one.txt";
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Person person = new Person("name", "surname");

        File file = new File("person.json");
        if(!file.exists()) {
            file.createNewFile();
        }

        //irasyti objekta i faila
        mapper.writeValue(file, person);

        //skaityti objekta is failo

        Person readValue = mapper.readValue(file, Person.class);
        System.out.println(readValue);

        //object to string
        String stringPerson = mapper.writeValueAsString(person);
        System.out.println(stringPerson);

        System.out.println(mapper.writeValueAsString(person));

        List<Person>persons = mapper.readValue(file, new TypeReference<>() {});
        System.out.println(persons);

        Map<String, Object>map = mapper.readValue(stringPerson, new TypeReference<>() {});



       /* Main main = new Main();
        main.write();
        main.read();
    }
    private void write() {
        Payment payment = new Payment(new Sender("Vardenis", "Pavardenis"),
                new Receiver("Gavejukas", "Gavejauskas"));

        try(ObjectOutput ou = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            ou.writeObject(payment);

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private void read() {
        try(ObjectInput oi = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Payment payment = (Payment) oi.readObject();
            System.out.println(payment);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }
}