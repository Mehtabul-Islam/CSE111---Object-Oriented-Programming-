public class BankAccount {
    public int acc = 0;
    public String type = "Not set";
    
    public String printDetails(){
        return "Account No: " + acc + "\nType: " + type ;
    }
    
    public void setInfo(int x, String y){
        acc = x;
        type = y;
        System.out.println("Account information updated!");
    }
}


public class Shape {
    public String name;
    public double area;
    
    public void setParameters(String x, int y){
        name = x;
        area = 3.1416 * y * y;
        
    }
    public void setParameters(String x, int y, int z){
        name = x;
        area = 0.5 * y * z;
        
    }
    public void setParameters(String x, double y, double z){
        name = x;
        area = y * z;
        
    }
    public String details(){
        return "Shape Name: " + name + "\nArea: " + area;
    }
}


public class Shelf {
    public int capacity;
    public int nob;
    
    public void showDetails(){
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + nob);
    }
    public void addBooks(int x){
        if(capacity - nob > x){
            nob = nob + x;
            System.out.println(x + " books added to shelf");
        }
        else if(capacity == 0){
            System.out.println("Zero capacity. Cannot add books.");
        }
        else
            System.out.println("Exceeds capacity");
    } 
        
}


public class Library{
    public int maxCap;
    public int totB;
    public String [] bookL;
    
    public void setBookCapacity(int x){
        maxCap = x;
        bookL = new String[maxCap];
    }
    public void addBook(String x){
        if(maxCap > totB){
        bookL[totB] = x;
        totB++;
       
        System.out.println("Book " + "'" + x + "'" + " added to the library");
        }
        else 
            System.out.println("Maximum capacity exceeds. You can't add more than " +  maxCap + " books");
    }
    public void printDetail(){
    System.out.println("Maximum Capacity: " + maxCap);
    System.out.println("Total Books: " + totB);
    System.out.println("Book list: ");
    for(int i = 0; i < totB; i++){
        System.out.println(bookL[i]);
        } 
    
    }
        
}


public class TaxiLagbe{
    public String taxNum;
    public String taxArea;
    public int totPass;
    public int totCol;
    public String [] arr = new String [4];
       
   
    public void storeInfo(String x, String y){
        taxNum = x;
        taxArea = y;
    }
    public void printDetails(){
        System.out.println("Taxi number: " + taxNum);
        System.out.println("This taxi can cover " + taxArea + " area");
        System.out.println("Total Passenger: " + totPass);
        System.out.println("Passenger Lists: ");
        for(int i = 0; i < totPass; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Total collected fair: " + totCol + " Taka");
    }
    public void addPassenger(String x, int y){
       
        if(totPass <=3){
        arr[totPass] = x;
        totPass++;
        totCol += y;
        System.out.println("Dear " + x + "! Welcome to TaxiLagbe");
        }
        else {
            System.out.println("Taxi Full! No more passengers can be added");
        totPass--;
        }
    }
    public void addPassenger(String x, int y, String z, int a){
       
       
        if(totPass <=4){
        arr[totPass] = x;
        totPass ++;
        arr[totPass] = z;
        totPass ++;
        totCol += y + a;


        System.out.println("Dear " + x + "! Welcome to TaxiLagbe");
        System.out.println("Dear " + z + "! Welcome to TaxiLagbe");
        }
        else {
            System.out.println("Taxi Full! No more passengers can be added");
        totPass--;
        }
    }
}


public class Student{
    public String name = "Not set";
    public String depart = "CSE";
    public double cgpa;
    public int credit = 9;
    public String sType = "Not set";
   
    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Department: " + depart);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Credits: " + credit);
        System.out.println("Scholarship Status: " + sType);
    }
   
    public void updateDetails(String x, double y, int z){
        name = x;
        cgpa = y;
        credit = z;
    }
    public void updateDetails(String x, double y){
        name = x;
        cgpa = y;
    }
    public void updateDetails(String x, double y, int z, String a){
        name = x;
        cgpa = y;
        credit = z;
        depart = a;
    }
   
    public void checkScholarshipEligibility(){
        if(cgpa >= 3.7){
        sType = "Merit based scholarship";
        System.out.println(name + " is eligible for " + sType);
        }
        else if(cgpa >= 3.5 && cgpa < 3.7){
        sType = "Need-based scholarship";
        System.out.println(name + " is eligible for " + sType);
        }
        else if(cgpa>=3.5 && credit>10){
        sType = "eligible for scholarship.";
        System.out.println(name + " is eligible for " + sType);
        }
        else{
            sType = "No scholarship";
            System.out.println(name + " is not eligible for scholarship");
        }
    }
}


public class Cart{
    public int num;
    public String [] arr = new String[3];
    public double [] arr2 = new double[3];
    public int count;
    public double sum;
    public double discount;
    
    public void create_cart(int x){
        num = x;
    }
    
    public void addItem(String x, double y){
        if(count < 3){
            arr[count] = x;
            arr2[count] = y;
            sum += arr2[count];
            count++;
            System.out.println(x + " added to cart " + num); 
            System.out.println("You have " + count + " item(s) in your cart now."); 
        }
        
        else
            System.out.println("You already have 3 items on your cart");
    }
    public void addItem(double x, String y){
        if(count < 3){
            arr[count] = y;
            arr2[count] = x;
            sum += arr2[count];
            count++;
            System.out.println(y + " added tor cart " + num); 
            System.out.println("You have " + count + " item(s) in your cart now"); 
        }
        else
            System.out.println("You already have 3 items on your cart");
    }
    public void cartDetails(){
        System.out.println("Your cart c" + num + " :");
        for(int i = 0; i < count; i++){
            System.out.println(arr[i] + " - " + arr2[i]);
        }

        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Total price: " + sum);
    }
    public void giveDiscount(int x){
        discount = x;
        sum = sum - (sum * discount)/100;
    }
}


public class Reader {
    public String name = "New user";
    public int capacity = 0;
    public String [] arr;
    public int count;
   
    public String createReader(String x, int y){
        name = x;
        capacity = y;
        arr = new String[capacity];
        return "A new reader is created!";
    }
    public void readerInfo(){
    System.out.println("Name: " + name);
    System.out.println("Capacity: " + capacity);
    System.out.println("Books: ");
   
    for(int i = 0; i < capacity; i++){
        if(count == 0){
            System.out.println("No books added yet");
        }
        else
        System.out.println("Book " + (i+1) + ": " + arr[i]);
    }
    }
    public void addBook(String x){
        if(count < capacity){
        arr[count] = x;
        count++;
        }
        else
            System.out.println("No more capacity");
    }
    
}