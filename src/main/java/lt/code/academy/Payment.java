package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class Payment implements Serializable {

    private  final Sender sender;
    private  final Receiver receiver;

    public Payment(Sender sender, Receiver receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }

    //  ObjectMapper reikes antroje uzduotyje



    }




/*public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT); // atvaizduos graziau

        User user = new User("Rimas", "Spakauskas", "email", 44);
        User secondUser = new User("Petras", "Pethshyts", "mainmail", 66);

        File file = new File("users.json");
        if(!file.exists()) {

            //write object tofile
            file.createNewFile();
        }
        mapper.writeValue(file, user);

        //nuskaitom objekta atgal - read object from file

        User readValue = mapper.readValue(file, User.class);
        System.out.println(readValue);

        //string to object
        String stringUser = mapper.writeValueAsString(secondUser);
        System.out.println(stringUser);

        //string tp object
        User objectUser = mapper.readValue(stringUser, User.class);
        System.out.println(objectUser);

        //write objects to jason file
        mapper.writeValue(file, List.of(user, secondUser, objectUser));

        //read object from file 17 d 19 valanda vid ndndndndndndndn
       List<User>users = mapper.readValue(file, new TypeReference<>() {
        });
        System.out.println(users);

        System.out.println(mapper.writeValueAsString(users));

        //mapo pvz
        Map<String, Object> map = mapper.readValue(stringUser, new TypeReference<>() {});
        System.out.println(map.get("netikrasVardas"));
        System.out.println(map.get("kitaPavarde"));


    }
}*/