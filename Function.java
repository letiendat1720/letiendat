package exam_ADF2;
import java.util.ArrayList;
import java.util.Scanner;
public class Function {
    //1. Add function
    public void add (){
        //Nhap du lieu tu man hinh
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book ID:");
        String id = scanner.nextLine();
        System.out.println("Book Title:");
        String title = scanner.nextLine();
        System.out.println("Author:");
        String author = scanner.nextLine();
        System.out.println("Price:");
        Integer price = scanner.nextInt();

        Book newBook = new Book(id,title,author,price);
        Book bookDAO = new Book();
        bookDAO.add(newBook);
    }
    //2.Save fuction
    public void save(){

    }

    //3.Display function
    public void display(){
        Connector connector = Connector.getInstance();
        Book bookDAO= new Book();
        ArrayList<Book> listBook= bookDAO.getList();
        for(Book x: listBook){
            System.out.println("BookID:"+ x.getId());
            System.out.println("Book Title:"+ x.getTitle());
            System.out.println("Author:"+ x.getAuthor());
            System.out.println("Price:"+ x.getPrice());
            System.out.println();
        }

    }
}
