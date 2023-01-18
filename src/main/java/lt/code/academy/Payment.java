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

    }

