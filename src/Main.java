public class Main {
    public static void main(String[] args) {
        Author JL = new Author("Джек", "Лондон");
        Book book1 = new Book("Мартин Иден", JL, 1909);
        Author EH = new Author("Эрнест", "Хемингуэй");
        Book book2 = new Book("Старик и море", EH, 1952);

         /*

        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("book1.getAuthor().getName() = " + book1.getAuthor().getName());
        System.out.println("book1.getAuthor().getLastname() = " + book1.getAuthor().getLastname());
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());

        book1.setPublishingYear(2024);

        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());

          */

        //создание копии для проверки методов
        Author EH2 = new Author("Эрнест", "Хемингуэй");
        Book book3 = new Book("Старик и море", EH2, 2024);
        //проверка .toString()
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);
        //проверка .equals()
        System.out.println("book2.equals(book3) = " + book2.equals(book3));
    }
}
