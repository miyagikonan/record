package record;

public record Person(String name, String furigana, int age) {
    public Person {
        var person = new Person("宮城", "miyagi", 21);
        person.name();
    }
}
