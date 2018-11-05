import java.util.Arrays;
//import java.util.Scanner;

public class Library {

    //Scanner in = new Scanner(System.in);
    int size = 10; //in.nextInt();
    Book[] books = new Book[size];
    int cadd = 0;
    int cremove = 0;



    public void bookadd(Book book){
        for(int i = 0; i< books.length; i++){
            if(books[i]==null){
                books[i] = book;
                cadd++;
                return;
            }
        }
        System.out.println("you have no place");
    }
    public void bookremove(Book book) {
        for(int i = 0; i < books.length; i++){
            if(book.getName().equals(books[i].getName())){
                books[i] = null;
                cremove++;
                return;
            }
        }
        System.out.println("free places");
    }
    public void ShowLibrary(){
        System.out.println("books on the desk"+ cadd);
        System.out.println(Arrays.toString(books));
        System.out.println("free places"+ cremove);
    }
}
