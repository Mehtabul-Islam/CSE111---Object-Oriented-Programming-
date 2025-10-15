public class BBAStudent extends Student{
    public BBAStudent(){
        super.setDepartment("BBA");
        super.setName("Default");
    }
    public BBAStudent(String x){
        super.setDepartment("BBA");
        super.setName(x);
    }
}



public class CheckingAccount extends Account{
    public static int count;
    public CheckingAccount(){
        super(0.0);
        CheckingAccount.count++;
    }
    public CheckingAccount(double x){
        super(x);
        CheckingAccount.count++;
    }
}



public class Dog extends Animal{
    public String breed;
    public String info(){
        String s = super.info();
        return s + "Breed: " + breed;
    }
    public Dog(String x, int y, String z, String a){
        super(x, y, z);
        this.breed = a;
    }
    public void makeSound(){
        System.out.println(color + " color " + name + " is barking");
    }
}
public class Cat extends Animal{
    public String breed;
    public String info(){
        String s = super.info();
        return s + "Breed: " + breed;
    }
    public Cat(String x, int y, String z, String a){
        super(x, y, z);
        this.breed = a;
    }
    public void makeSound(){
        System.out.println(color + " color " + name + " is meowing");
    }
}



public class Vehicle2010 extends Vehicle{
    public void moveLowerLeft(){
        super.moveDown();
        super.moveLeft();
    }
    public void moveUpperRight(){
        super.moveUp();
        super.moveRight();
    }
    public void moveLowerRight(){
        super.moveDown();
        super.moveRight();
    }
    public void moveUpperLeft(){
        super.moveUp();
        super.moveLeft();
    }
}



public class ComplexNumber extends RealNumber{
    public double imgValue;
    public ComplexNumber(){
        super(1.0);
        imgValue = 1.0;
    }
    public ComplexNumber(double x, double y){
        super(x);
        imgValue = y;
    }
    public String toString() {
        return super.toString() + "\nImaginaryPart: " + imgValue;
    }
}



public class Manager extends Employee{
    public double bonus;
    public double finalSalary;
    public Manager(String x, int a, int b, double c){
        super(x, a, b);
        bonus = c;   
    }
    public void calculateSalary(){
        finalSalary = getBaseSalary();
        if(getHoursWorked() > 40){
            finalSalary += (bonus/100 * getBaseSalary());
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+ bonus + " % " + "\nFinal Salary: " + finalSalary);
    }
    public void requestIncrement(int x){
        if(getHoursWorked() > 100){
            setBaseSalary(getBaseSalary() + x);
            System.out.println("$" + x + " Increment approved.");
        }
        else if(getHoursWorked() > 80){
            setBaseSalary(getBaseSalary() + x/2.0);
            System.out.println("$" + x/2.0 + " Increment approved.");
        }
        else{
            System.out.println("Increment denied.");
        }
        
    }
}
public class Developer extends Employee{
    public String language;
    public double finalSalary;
    public Developer(String x, int a, int b, String c){
        super(x, a, b);
        language = c;   
    }
    public void calculateSalary(){
        finalSalary = getBaseSalary();
        if(language.equals("Java")){
            finalSalary += 700;
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+ language + "\nFinal Salary: " + finalSalary);
    }
}



public class CinemexTicket extends MovieTicket{
    public String genre;
    public static int count;
    public boolean buy;
    public String seat;
    public CinemexTicket(String x, String y, String z, String a){
        super(x, a, y, 0.0);
        genre = z;
        count++;
        seat = seatTypes[0];
        buy = false;
        generateID();
    }
    public CinemexTicket(String x, String y, String z, String a, String b){
        super(x, a, y, 0.0);
        genre = z;
        count++;
        seat = b;
        buy = false;
        generateID();
    }
    public String confirmPayment() {
        if (buy) {
            return "Ticket price is already paid!";
        } else {
            buy = true;
            return "Payment Successful.";
        }
    }
    public static void getTotalTickets(){
        System.out.println("Total movie ticket(s): " + count);
    }
    public void calculateTicketPrice(){
        double price = 0.0;
        for (int i = 0; i < seatTypes.length; i++) {
            if (seatTypes[i].equals(seat)) {
                price = seatPrices[i];
                break;
            }
        }
        
        setPrice(price);
    }
    public void generateID(){
        char firstLetter = ' ';
        for (int i = 0; i < seatTypes.length(); i++) {
            if (seatTypes.charAt(i) != ' ') {
                firstLetter = seatType.charAt(i);
                break;
            }
        }
        System.out.println(super.movie + "-" + firstLetter + "-" + count);
    }
    public String toString() {
        return "Ticket ID: " + ticketID + "\n" +
               super.toString() + "\n" +
               "Genre: " + genre + "\n" +
               "Seat Type: " + seat + "\n" +
               "Price(tk): " + getPrice() + "\n" +
            "Status: " + if(buy = true){System.out.println("Paid");}
        else{System.out.println("Not paid");}
    }
}



public class KKTea extends Tea{
    public int weight;
    public int teabags;
    public static int regularSales;
    public static int totalSales;
    
    public KKTea(int x, int y){
        super("KK Regular Tea", x);
        teabags = y;
        weight = y * 2;
    }
    public void productDetail(){
        super.productDetail();
        System.out.println("Weight: " + weight + ", Tea Bags: " + teabags);
    }
        
    public static void updateSoldStatusRegular(KKTea x) {
        if (!x.status) {
            x.status = true;
            regularSales++;
            totalSales++;
        }
    }

    public static void totalSales() {
        System.out.println("Total Sales: " + totalSales);
        System.out.println("KK Regular Tea: " + regularSales);
    }
}
public class KKFlavouredTea extends Tea{
    public static int flavoured = 0;
    public KKFlavouredTea(String x, int y, int z){
        super("KK " + x + " Tea", y);
    }
    public static void updateSoldStatusFlavoured(KKFlavouredTea x) {
        if (!x.status) {
            x.status = true;
            flavoured++;
            KKTea.totalSales++;
        }
    }
    public static void totalSales() {
        System.out.println("Total Sales: " + KKTea.totalSales);
        System.out.println("KK Regular Tea: " + KKTea.regularSales);
        System.out.println("KK Flavoured Tea: " + flavoured);
    }
}