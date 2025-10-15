public class Product{
    private String name = "Unknown";
    private double price;
    private int quantity;
    
    public Product(){
    }
    
    public Product(String x, double y){
        name = x;
        price = y;
    }
    
    public void setName(String x){
        name = x;
    }
    public String getName(){
        return name;
    }
    
    public void setPrice(double x){
        price = x;
    }
    public double getPrice(){
        return price;
    }
    
    public void setQuantity(int x){
        quantity = x;
    }
    public int getQuantity(){
        return quantity;
    }
    
    public void displayInfo(){
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
    
    public void displayInfo(boolean x){
        if(x == true){
            displayInfo();
            System.out.println("Quantity: " + quantity);
        }
        else{
            displayInfo();
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


public class Passenger{
    public static int no_of_passenger;
    public static double total_fare;
    public String name;
    public double fare;
    
    public Passenger(String x, double y){
        name = x;
        fare = y * 20;
        total_fare += fare;
        no_of_passenger++;
    }
    
    public void passengerDetails(){
        System.out.println("Name: " + name);
        System.out.println("Fare: " + fare);
    }
    
    public void storeBaggageWeight(double x){
        fare += 10 * x;
        total_fare += x * 10;
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


public class Book{
    public static int total_books_sold;
    public static double total_revenue;
    public String title;
    public double price;
    
    public Book(String x, int y){
        title = x;
        price = 150 - (150 * y/100.0);
        total_books_sold++;
        total_revenue += price;
    }
    
    public void bookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Price after Discount: " + price);
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------



public class Circle{
    private double radius;
    public static int count;
    public double area;
    public Circle(double x){
        count++;
        radius = x;
    }
    
    public void setRadius(double x){
        radius = x;
    }
    public double getRadius(){
        return radius;
    }
    public double area(){
        area = 3.1416 * radius * radius;
        return area;
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------



public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String name;
    public String [] books = new String[9];
    public int count;
    public static void bookStatus(){
        System.out.println("Available Books: ");
        for(int i = 0; i < book_count.length; i++){
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }
    
    public Borrower(String x){
        name = x;
    }
    
    public void borrowBook(String x){
        for(int i = 0; i < book_name.length; i++){
            if(book_name[i].equals(x)){
                if(remainingBooks(x) > 0){
                    books[count] = book_name[i];
                    count++;
                    book_count[i]--;
                }
                else{
                    System.out.println("This book is not available.");
                }
            }
        }
    }
    public static int remainingBooks(String x){
        
        for(int i = 0; i < book_count.length; i++){
            if(book_name[i].equals(x)){
                return book_count[i];
            }
        }
        return 0;
    }
    public void borrowerDetails(){
        System.out.println("Name: " + name);
        System.out.println("Books Borrowed: ");
        for(int i = 0; i < count; i++){
            System.out.println(books[i]);
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------



public class Cargo{
    public String contents;
    public double weight;
    public static int count = 1;
    public static double capacity = 10.0;
    public boolean loaded;
    public int id;
    
    public static double capacity(){
        return capacity;
    }
    public Cargo(String x, double y){
        contents = x;
        weight = y;
        id = count++;
    }
    
    public void load(){
        if(weight <= capacity){
            capacity = capacity - weight;
            loaded = true;
            System.out.println("Cargo " + id + " loaded for transport.");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }
    
    public void unload(){
        loaded = false;
        capacity = capacity + weight;
        System.out.println("Cargo " + id + " unloaded.");
    }
    
    public void details(){
        System.out.println("Cargo ID: " + id + ", Contents: " + contents + ", Weight: " + weight + ", Loaded: " + loaded);  
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------



public class Student{
    public static int totalSt;
    public static int cseSt;
    public static int otherSt;
    public double cgpa;
    public static int count;
    public int id;
    public String name;
    public String dept = "CSE";
    
    public Student(String x, double y){
        id = ++count;
        name = x;
        cgpa = y;
        cseSt++;
        totalSt++;
    }
    
    public Student(String x, double y, String z){
        id = ++count;
        name = x;
        cgpa = y;
        dept = z;
        otherSt++;
        totalSt++;
    }
    
    public static void printDetails(){
        System.out.println("Total Student(s): " + totalSt);
        System.out.println("CSE Student(s): " + cseSt);
        System.out.println("Other Department Student(s): " + otherSt);
    }
    
    public void individualDetail(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + dept);
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------



public class Player{
    public static int total;
    public String name;
    public String country;
    public int num;
    public static String [] players = new String[11];
    public static int count;
    
    public Player(String x, String y, int z){
        name = x;
        country = y;
        num = z;
        total++;
        players[count++] = name;
    }
    
    public String player_detail(){
        return "Player Name: " + name + "\nJersey Number: " + num + "\nCountry: " + country;
    }
    
    public static void info(){
        System.out.println("Total number of players: " + total);
        for(int i = 0; i < count; i++){
            if(i==0){
                System.out.print("Players enlisted so far: ");
            }
            if(i < count - 1){
            System.out.print(players[i] + ", ");
            }
            else if(i == count - 1){
                System.out.print(players[i]);
            }
        }
        
        System.out.println();
    }
}
