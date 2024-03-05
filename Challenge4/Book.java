package Challenge4;

class Book {
       static int totalNoOfBooks;
       String isbn;
       String title;
       String author;
       boolean isBorrowed;

       static{
              totalNoOfBooks = 0;
       }
       // Object init
       {
              totalNoOfBooks++;
       }

       Book(String isbn, String title, String author){
              this.isbn = isbn;
              this.title = title;
              this.author = author;
       }

       Book(String isbn){
              this(isbn,"Unknown","Unknown");
       }

       static int getTotalnoOfbooks(){
              return totalNoOfBooks;
       }

       void borrowBook(){
              if(isBorrowed){
                     System.out.println("Book is already borrowed");
              }
              else{
                     this.isBorrowed = true;
                     System.out.println("Enjoy the book " + this.title);
              }
       }

       void returnBook(){
              if(isBorrowed){
                     this.isBorrowed = false;
                     System.out.println("Hope you enjoyed the book of "  + this.title + ", " + " Please leave a review");
              }
              else{
                     System.out.println("This book is already in the library");
              }

       }

       public static void main(String[] args) {
              
              Book javaBook = new Book("1","Java","James Gosling");
              Book pythonBook = new Book("2","Python","Guido van Rossum");

              System.out.println(Book.getTotalnoOfbooks());
              javaBook.borrowBook();
              pythonBook.borrowBook();
              pythonBook.returnBook();
       }


       
       
       

       

   
}
