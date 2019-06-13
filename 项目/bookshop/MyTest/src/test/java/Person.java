public class Person {
    Person(String frist_name, String last_name){
        this.first_name = frist_name;
        this.last_name = last_name;
    }
    String getFirstName() {
        return this.first_name;
    }
    String getLastName() {
        return this.last_name;
    }
    String first_name;
    String last_name;
}
