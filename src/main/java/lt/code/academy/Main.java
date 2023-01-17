package lt.code.academy;

import java.io.*;

public class Main {
    private static final String FILE_NAME = "my_task_one.txt";
    public static void main(String[] args) {
        Main main = new Main();
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
        }
    }
}