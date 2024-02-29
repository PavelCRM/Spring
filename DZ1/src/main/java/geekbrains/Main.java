package geekbrains;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Person
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(30);

        // Сериализация объекта в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("JSON: " + json);

        // Десериализация JSON обратно в объект Person
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Deserialized Person: " + deserializedPerson);
    }
}
