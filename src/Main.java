
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author author = new Author("Эйкичи", "Урусава");
        Book twentyCenturyBoys = new Book("Мальчишки 20 века", author, 2023);
        Author author1 = new Author("Какой-то", "Пчел");
        Book emptyBoxZeroMaria = new Book("Пустая шкатулка. Нулевая Мария", author1, 2010);
        twentyCenturyBoys.setYear(1999);

    }

}