package lt.code.academy;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class PersonSerializer extends StdSerializer<Person> {
    protected PersonSerializer() {
        super(Person.class);
    }
//generate -> implement methods
    @Override
    public void serialize(Person person, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("name", person.name());
        jsonGenerator.writeStringField("surname", person.surname());
        jsonGenerator.writeEndObject();
    }
}
