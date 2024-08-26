import exercise.InMemoryKV;
import exercise.KeyValueStorage;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));
// Получение значения по ключу
        storage.get("key", "default"); // "10"
        storage.get("unknown", "default"); // "default"
// Установка нового значения
        storage.set("key2", "value2");
        storage.get("key2", "default"); // "value2"
// Удаление ключа
        storage.unset("key2");
        storage.get("key2", "default"); // "default"
// Получение всех данных из базы
        Map<String, String> data = storage.toMap();
        System.out.println(data); // => {key=10};
    }
}
