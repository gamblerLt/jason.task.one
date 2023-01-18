package lt.code.academy;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class PersonDeserializer extends StdDeserializer<Person> {
    protected PersonDeserializer(){
        super(Person.class);
    }
    @Override
    public Person deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode jsonNode =jsonParser.getCodec().readTree(jsonParser);
        String personName = getValue(jsonNode, "personName");
        String personSurname = getValue(jsonNode,"personSurname");

        return new Person(personName, personSurname);
    }
    private String getValue(JsonNode jsonNode, String fieldname) {
        JsonNode value = jsonNode.get(fieldname);
        return value !=null ? value.asText() : null;
    }
}
