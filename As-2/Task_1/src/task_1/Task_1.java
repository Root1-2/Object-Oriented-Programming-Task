package task_1;
class Book
{
    String title; String author; int price; int pages; String publication; String edition;
    void showInfo()
    {
        System.out.println(title +" "+ edition + " edition");
        System.out.println("By "+author);
        System.out.println(pages + " pages");
        System.out.println("Price: "+price + " tk");
        System.out.println(publication);

    }
}
    class Task_1
    {
        public static void main(String[] args)
        {
            Book book1  = new Book();
            book1.title = "Beginning Programming with Java For Dummies ";
            book1.edition = "5th";
            book1.author = "Barry Burd";
            book1.pages = 600;
            book1.price = 49;
            book1.publication = "Codes for Programmers";
            Book book2  = new Book();
            book2.title = "Harry Potter and the Goblin of Fire ";
            book2.edition = "1st";
            book2.author = "J.K Rowling";
            book2.pages = 122;
            book2.price = 128;
            book2.publication = "Pottermore Publishing";
            book1.showInfo();
            book2.showInfo();
        }
    }

