package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class Validator {
    Address address;
//Создайте класс Validator и публичный статический метод validate().
// Метод принимает на вход экземпляр класса и проверяет, что свойства,
// помеченные в классе аннотацией @NotNull, не имеют значение null.
// Метод должен вернуть список List с названием полей, которые не прошли валидацию
// (т.е. помечены аннотацией @NotNull, но при этом имеют значение null).
// Обратите внимание, что свойства в объекте приватные и для обращения к ним нет селекторов,
// поэтому вам нужно будет воспользоваться рефлексией.
    public Validator(Address address) {
        this.address = address;
    }
    public static List<String> validate(Address address) {
        List<Field> fields = List.of(address.getClass().getDeclaredFields());
        return fields.stream()
                .filter(field -> field.isAnnotationPresent(NotNull.class))
                .filter(field -> {
                    Object value;
                    try {
                        field.setAccessible(true);
                        value = field.get(address);
                        field.setAccessible(false);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return value == null;
                })
                .map(Field::getName)
                .collect(Collectors.toList());
    }



}
// END
