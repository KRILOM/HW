public class Main2 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("book1");
        Book book2 = new Book();
        book2.setName("book2");
        Book book3 = new Book();
        book3.setName("book3");
        Book book4 = new Book();
        book4.setName("book4");
        Book book5 = new Book();
        book5.setName("book5");
        Book book6 = new Book();
        book6.setName("book6");
        Book book7 = new Book();
        book7.setName("book7");
        Book book8 = new Book();
        book8.setName("book8");
        Book book9 = new Book();
        book9.setName("book9");
        Book book10 = new Book();
        book10.setName("book10");

        Library library = new Library();
        library.bookadd(book1);
        library.bookadd(book2);
        library.bookadd(book3);
        library.bookadd(book4);
        library.bookadd(book5);
        library.bookadd(book6);
        library.bookadd(book7);
        library.bookadd(book8);
        library.bookadd(book9);
        library.bookadd(book10);
        library.bookremove(book4);

        library.ShowLibrary();
    }
}
