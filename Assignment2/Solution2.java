//Assignment02Task01
public class UniversityTester {
    public static void main (String [] args){
    //a
    University u1 = new University();
    University u2 = new University();
    //Location of the objects are different.
    //b
    u1.name = "Imperial College London";
    u1.country = "England";
    u2.name = "Brac University";
    u2.country = "Bangladesh";
    System.out.println(u1.name);
    System.out.println(u1.country);
    System.out.println(u2.name);
    System.out.println(u2.country);
    }
}


//Assignment02Task02
public class Student{
    public String name = "Default";
    public int id;
}


//Assignment02Task03
public class CSECourse{
    public String courseName = "Programming Language II";
    public String courseCode = "CSE111";
    public int credit = 3;
}


//Assignment02Task04
public class ImaginaryNumber{
    public int realPart;
    public int imaginaryPart;
   
    public void printNumber(){
    System.out.print(realPart + " + ");
    System.out.print(imaginaryPart + "i");
    System.out.println();
    }
}


//Assignment02Task05
public class Course{
   
    public String st1;
    public String st2;
    public int nm1;
   
   
    public void updateDetails(String x, String y, int a){
   
    st1 = x;
    st2 = y;
    nm1 = a;
       
    }
    public void displayCourse(){
   
    System.out.println("Course Name: " + st1);
    System.out.println("Course Code: " + st2);
    System.out.println("Course Credit: " + nm1);
   
    }
}


//Assignment02Task06
public class Assignment{
   
    public int tasks;
    public String difficulty;
    public boolean submission;
   
   
    public void printDetails(){
   
    System.out.println("Number of tasks: " + tasks);
    System.out.println("Difficulty level: " + difficulty);
    System.out.println("Submission required: " + submission);
       
    }
    public String makeOptional(){
   
        if(submission == true){
            submission = false;
        return "Assignment will not required";
        }
        else
        return "Submission is already not require";
    }
}


//Assignment02Task07
public class CellPhone{
    
    public String model = "unknown";
    public String [] arr = new String [3];
    public int count = 0;
    
    public void printDetails(){
        
        System.out.println("Phone Model " + model);
        System.out.println("Contacts Stored " + count);
        
        if(count > 0){
        System.out.println("Stored Contacts: ");
        }
        for(int i = 0; i < count; i++){
        System.out.println(arr[i]);
        }
        
    }
    
    public void storeContact(String x){
        
        if(count < 3)
        {
            arr[count] = x;
            count++;
            System.out.println("Contact Stored");
            
        }
        else 
            System.out.println("Memory full. New contact can't be stored.");
    }
    
    
    
    
}


//Assignment02Task08
public class Employee {
    
    public String name;
    public double salary = 30000.0;
    public String designation = "junior";
    public double tax;
    public void newEmployee(String x){
        
        name = x;
        
    }
    
    public void displayInfo(){
        
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + designation);
    }
    
    public void calculateTax(){
        
        if(salary > 30000 && salary <= 50000)
        {
            tax = salary*0.1;
        }
        else if(salary > 50000)
        {
            tax = salary*0.3;
        }
        if(salary <= 30000){
            System.out.println("No need to pay tax");
        }
        else
        System.out.println(name + " tax amount: " + tax + " tk");
    }
    
    public void promoteEmployee(String y){
        
        designation = y;
        if(designation.equals("senior"))
        {
            salary += 25000;
        }
        else if(designation.equals("lead"))
        {
            salary += 50000;
        }
        else if(designation.equals("manager"))
        {
            salary += 75000;
        }
        System.out.println(name + " has been promoted to " + designation);
        System.out.println("New Salary: " + salary); 
    }
}
