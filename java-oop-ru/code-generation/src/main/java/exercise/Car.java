package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Data;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Data
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
    public static Car unserialize(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(json, Car.class);
    }
    // END
}
