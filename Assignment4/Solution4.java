public class Student{
    public String name;
    public String prog;
   
    public Student(String x, String y){
        name = x;
        prog = y;
    }
    public void updateName(String x){
        name = x;
    }
    public void updateProgram(String x){
        prog = x;
    }
    public String accessProgram(){
    return prog;
    }
}


public class Toy{
    public String name;
    public int taka;
   
    public Toy(String x, int y){
        name = x;
        taka = y;
        System.out.println("A new toy has been made!");
    }
    public void updatePrice(int x){
        taka = x;
    }
    public void showPrice(){
        System.out.println("price: " + taka);
    }
    public void updateName(String x){
        System.out.println("Changing old name: " + name);
        name = x;
        System.out.println("new name: " + name);
    }
}


public class Shape2D{
    public String name = "Square";
    public int length = 5;
    public int breadth;
    public int extra;
    public double area;
   
    public Shape2D(){
    System.out.println("A Square has been created with length: " + length);
    }
    public Shape2D(int x, int y){
        length = x;
        breadth = y;
        name = "Rectangle";
    System.out.println("A Rectangle has been created with length: " + length + " and breadth: " + breadth);
    }
    public Shape2D(int x, int y, String z){
        length = x;
        breadth = y;
        name = z;
    System.out.println("A Triangle has been created with height: " + length + " and base: " + breadth);
    }
    public Shape2D(int x, int y, int z){
        length = x;
        breadth = y;
        extra = z;
        name = "Triangle2";
    System.out.println("A Triangle has been created with the following sides: " + length + ", " + breadth + ", " + extra);
    }
    public void area(){
        if(name.equals("Square")){
        area = length * length * 1.0;
        System.out.println("The area of the " + name + " is: " + area);
        }
        else if(name.equals("Rectangle")){
        area = length * breadth * 1.0;
        System.out.println("The area of the " + name + " is: " + area);
        }
        else if(name.equals("Triangle")){
        area = length * breadth * 0.5;
        System.out.println("The area of the " + name + " is: " + area);
        }
        else if(name.equals("Triangle2")){
        double s = (length + breadth + extra) / 2.0;
       
        area = Math.sqrt((s*(s-length)*(s-breadth)*(s-extra)));
        System.out.printf("The area of the " + name + " is: %.2f%n ", area);
        }        
    }
}

public class Student{
    public int id;
    public double cgpa;
    public String [] arr = new String[4];
    public int count;
   
    public Student(int x){
    id = x;
    System.out.println("A student with ID " + id + " has been created.");
    }
    
    public Student(int x, double y){
    id = x;
    cgpa = y;
    System.out.println("A student with ID " + id + " and cgpa " + cgpa + " has been created.");
    }
   
    public void addCourse(String x){
        if(count == 3 && cgpa < 3){
            System.out.println("Failed to add " + x);
            System.out.println("CG is low. Can't add more than 3 courses.");
        }
        else if(cgpa != 0 && count < 4){
        arr[count++] = x;    
        }
        else if(count == 4){
        System.out.println("Failed to add " + x);
        }
        else{
            System.out.println("Failed to add " + x);
             System.out.println("Set CG first ");
        }
    }
    public void addCourse(String [] x){
        
        for(int i = 0; i < x.length; i++){
        if(count == 4){
        System.out.println("Failed to add " + x[i]);
        System.out.println("Maximum 4 courses allowed.");
        break;
        }
        else if(count == 3 && cgpa < 3){
            System.out.println("Failed to add " + x);
            System.out.println("CG is low. Can't add more than 3 courses.");
            break;
        }
        else if(cgpa != 0 && count < 4){
            arr[count++] = x[i];    
        }
        }
    }
    public void storeCG(double x){
        cgpa = x;
    }
    public void showAdvisee(){
        System.out.println("Student ID: " + id + ", CGPA: " + cgpa);
        
        if(count > 0){
        System.out.println("Added courses are: ");
        for(int i = 0; i < count; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
        else
            System.out.println("No courses added");
    }
    public void removeAllCourse(){
    count = 0;
    arr = new String[4];
    }
    public void storeID(int x){
    id = x;
    count = 0;
    }
}


public class Triangle{
    public int num1;
    public int num2;
    public int num3;
    public int perimeter;
   
    public void updateSides(int x, int y, int z){
        num1 = x;
        num2 = y;
        num3 = z;
        perimeter = num1 + num2 + num3;
    }
    public void triangleDetails(){
        System.out.println("Three sides of the triangle are: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Perimeter: " + perimeter);
    }
    public String printTriangleType(){
       
            if(num1 == num2 && num2 == num3){
        return  "This is an Equilateral Triangle." ;
        }
        else if(num1 == num2 && num2 != num3){
        return  "This is an Isosceles Triangle.";
        }
        else{
        return "This is an Scalen Triangle.";
        }
       
    }
    public void compareTriangles(Triangle t){
        if(this == t){
            System.out.println("These two triangle objects have the same address.");
        }
        else{
            if((this.num1 == t.num1) && (this.num2 == t.num2) && (this.num3 == t.num3)){
                System.out.println("Addresses are different but the sides of the triangles are equal.");
        }
        else{
            if(this.perimeter == t.perimeter){
                System.out.println("Only the perimeter of both triangles is equal.");
            }
            else{
                System.out.println("Addresses, length of the sides and perimeter all are different.");
            }
        }
        }
    }
}


public class Course{
    public String code;
    public Course(String x){
    code = x;
    }
}
public class Teacher{
    public String name;
    public String initial;
    public String [] courses = new String[3];
    public int count;
    public Teacher(String x, String y){
        name = x;
        initial = y;
        System.out.println("A new teacher has been created");
    }
    public void printDetail(){
        System.out.println("Name: " + name);
        System.out.println("Initial: " + initial);
        System.out.println("List of courses: ");
        for(int i = 0; i < count; i++){
        System.out.println(courses[i] + " ");
        }
    }
    public void addCourse(Course c){
        courses[count] = c.code;
        count++;
    }
}


public class BracuStudent{
    public String name;
    public String live;
    public boolean con = false;
   
    public BracuStudent(String x, String y){
        name = x;
        live = y;
    }
    public void showDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Lives in " + live);
        System.out.println("Have bus pass? " + con);
    }
    public void getPass(){
    con = true;
    }
    public void updateHome(String x){
    live = x;
    }
}
public class BracuBus{
  public String area;
  public int max = 2;
  public int count;
  public String [] arr1;
  public BracuBus(String x){
  area = x;
  arr1 = new String[2];
  }
  public BracuBus(String x, int y){
  area = x;
  max = y;
  arr1 = new String[y];
  }
  public void showDetails(){
    System.out.println("Bus Route: " + area);
    System.out.println("Passenger Count: " + count + " (Max: " + max+ ")");
    System.out.println("Passenger on board: ");
    for(int i = 0; i < count; i++){
    System.out.print(arr1[i] + " ");
    }
  }
  public void board(){
    if(count == 0){
      System.out.println("No passengers");
    }
  }
  public void board(BracuStudent x, BracuStudent y){
    if(x.con == true){
      if(x.live == area){
        if(count == max){
        System.out.println("Bus is full");
        }
        else{
      arr1[count] = x.name;
      System.out.println(x.name + " boarded the bus");
      count++;
        }
      }
      else
        System.out.println("You got on the wrong bus!");
    }
    else
      System.out.println("You don't have a bus pass!");
 
  if(y.con == true){
      if(y.live == area){
        if(count == max){
        System.out.println("Bus is full");
        }
        else{
      arr1[count] = y.name;
      System.out.println(y.name + " boarded the bus");
      count++;
        }
      }
      else
        System.out.println("You got on the wrong bus!");
    }
    else
      System.out.println("You don't have a bus pass!");
}
  public void board(BracuStudent x){
    if(x.con == true){
      if(x.live == area){
        if(count == max){
            System.out.println("Bus is full");
        }
        else{
            arr1[count] = x.name;
            System.out.println(x.name + " boarded the bus");
            count++;
        }
      }
      else
        System.out.println("You got on the wrong bus!");
    }
    else
      System.out.println("You don't have a bus pass!");
  }
}


public class Student{
    public String name;
    public int id;
    public String depart;
    public String email;
    public String password;
    public String login;
    public String [] courses = new String[3];
    public int count = 0;
    
    public Student(String x, int y, String z){
        name = x;
        id = y;
        depart = z;
        System.out.println("Student object is created");
    }
    
    public void addCourse(String a){
        if (count < 3) {
            courses[count++] = a;
        }
    }
    public void AdviseeInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + depart);
        System.out.println("Advised Courses: ");
        if (count != 0){
            for (int i = 0; i < count; i++){
                System.out.print(courses[i] + " ");
            }
            System.out.println();

        }
    }
    
}
public class Usis{
    public int totalAdvisee = 0;
    public Student [] students = new Student[5];
    
    public Usis(){
        System.out.println("Usis is ready to use!");
    }
    
    public void login(Student st){
        if (st.email == null){
            System.out.println("Email and password need to be set");
        } 
        else {
            st.login = "true";
            System.out.println("Login successful");
        }
    }
    
    public void advising(Student s1){
        if (s1.login == null){
            System.out.println("Please login to advise courses!");
        } else {
            System.out.println("You haven't selected any courses");
        }
    }
    
      public void advising(Student s, String a, String b, String c){
        s.addCourse(a);
        s.addCourse(b);
        s.addCourse(c);
        this.students[this.totalAdvisee++] = s;
        System.out.println("Advising successful!");
    }
      
      public void advising(Student s, String c1, String c2, String c3, String c4){
        System.out.println("You need special approval to take more than 3 courses");
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee: " + totalAdvisee);
        for (int i = 0; i < totalAdvisee; i++){
            students[i].AdviseeInfo();
            System.out.println("==============");
        }
    }
      
}
