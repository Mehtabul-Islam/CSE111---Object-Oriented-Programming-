import java.util.Scanner;
public class CSE111Task01
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int maximum = 1;
        int minimum = 99999999;
        int sum = 0;
        double count = 0;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Enter values: ");
            int num = sc.nextInt();
            if (num > 0 && num % 2 != 0)
            {
                if (num > maximum){
                maximum = num;
                }
                if (num < minimum){
                minimum = num;
                }
                sum = sum + num;
                count ++;
            } 
        }
        
        if (sum > 0)
        {
            System.out.println("Sum = " + sum);
            System.out.println("Maximum = " + maximum);
            System.out.println("Minimum = " + minimum);
            double avg = sum / count;
            System.out.println("Average = " + avg);  
        }
        else 
            System.out.println("No odd positive numbers found");
        
    }
}


import java.util.Scanner;
public class CSE111Task02
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Starting number: ");
        int num1 = sc.nextInt();
        System.out.println("Ending number: ");
        int num2 = sc.nextInt();
        int numCount = 0;
        
        if (num1 < num2)
        {
            for (int i = num1; i <= num2; i++)
            {
                int count = 0; 
                for (int j = 1; j <= i; j++)
                {
                    if (i % j == 0)
                    {
                        count++;
                    }
                }
                if (count == 2)
                {
                    numCount++;
                }
            }
        }
        else if (num2 < num1)
        {
            for (int i = num2; i <= num1; i++)
            {
                int count = 0; 
                for (int j = 1; j <= i; j++)
                {
                    if (i % j == 0)
                    {
                        count++;
                    }                    
                }
                if (count == 2)
                {
                    numCount++;
                }
            }
        }
        if (num1 < num2)
        {
            System.out.println("There are " + numCount + " prime numbers between " + num1 + " and " + num2);
        }
        else 
            System.out.println("There are " + numCount + " prime numbers between " + num2 + " and " + num1);
    }
}


import java.util.Scanner;
public class CSE111Task03
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Starting string: ");
        String s1 = sc.nextLine();
        System.out.println("Ending string: ");
        String s2 = sc.nextLine();
        String output = s1 + " " + s2;
        System.out.println(output);
        
        int sum = 0;
        for (int i = 0; i < output.length(); i++)
        {
            char ch = output.charAt(i);
            if (ch >= 'a' && ch <= 'z' ||  ch > 'A' && ch <= 'Z')
            {
                sum += (int)ch;
            }
        }
        System.out.println(sum);
        
    }
}


import java.util.Scanner;
public class CSE111Task04
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Lowercase input: ");
        String s1 = sc.nextLine();
        String s2 = "";
        
        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            int num = (int)ch - 1;
            s2 = s2 + (char)num;
        }
        System.out.println(s2);
    }
}


import java.util.Scanner;
public class CSE111Task05
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter length of Array: ");
        int n1 = sc.nextInt();
        int [] arr1 = new int [n1];
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println("Enter values: ");
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n1/2; i++)
        {
            int temp = arr1[i];
            arr1[i] = arr1[n1 - 1 - i];
            arr1[n1 - 1 - i] = temp;
        }
        for(int i = 0; i < n1; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}


import java.util.Scanner;
public class CSE111Task06
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter length of Array: ");
        int n1 = sc.nextInt();
        int [] arr1 = new int [n1];
        boolean [] arr2 = new boolean [n1];
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println("Enter values: ");
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n1; i++)
        {
            if(arr2[i] == false)
            {
                int count = 1;
                for(int j = i + 1; j < n1; j++)
                {
                    if(arr1[i] == arr1[j])
                    {
                        count++;
                        arr2[j] = true;
                    }
                }
                System.out.println(arr1[i] + " - " + count + " times");
            }
        }
    }
}


import java.util.Scanner;
public class CSE111Task07
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of an array: ");
        int N = sc.nextInt();
        double [] arr1 = new double [N];
       
        for (int i = 0; i < N; i++)
        {
            System.out.println("Please enter the elements of the array: ");
            arr1[i] = sc.nextDouble();
        }
       
        double [] arr2 = new double [N];
        int j = 0;
       
        for (int i = 0; i < N; i++)
        {
            if(i == 0 || arr1[i] != arr1[i - 1])
            {
                arr2[j] = arr1[i];
                j++;
            }
        }
        int removed = N - j;
        System.out.println("New array: ");
        for (int i = 0; i < j; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Elements removed: " + removed);
    }
}


import java.util.Scanner;
public class CSE111Task08
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();
        int [][] arr1 = new int [row][col];
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                System.out.println("Enter values for array: ");
                arr1[r][c] = sc.nextInt();
            }
        }
        System.out.println("2D Array: ");
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                System.out.print(arr1[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("1D Array: ");
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                System.out.print(arr1[r][c] + " ");
            }
        }
        System.out.println();
    }
}


import java.util.Scanner;
public class CSE111Task09
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the matrix: ");
        int N = sc.nextInt();
       
        int [][] arr1 = new int [N][N];
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
            System.out.println("Please enter the elements of the array: ");
            arr1[i][j] = sc.nextInt();
            }
        }
        boolean identity = true;
       
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
            if (i == j && arr1[i][j] != 1)
            {
                identity = false;
                break;
            }
            else if (i != j && arr1[i][j] != 0)
                {
                    identity = false;
                    break;
                }
            }
        }
        if (identity)
        {
            System.out.println("Identity Matrix");
        }
        else
            System.out.println("Not an Identity Matrix");
    }
}


import java.util.Scanner;
public class CSE111Task10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr2D =
        {
            {0, 0, 10, 0, -1},
            {0, -1, 0, 0, -1},
            {-1, 0, -1, 0, 0},
            {0, -1, 7, 0, -1},
            {0, -1, 0, -1, 0}
        };
        System.out.println("Initial Map:");
        printMap(arr2D);
        int row = arr2D.length;
        int col = arr2D[0].length;
        int row_pos = -1;
        int col_pos = -1;
        outer:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr2D[i][j] == 7) {
                    row_pos = i;
                    col_pos = j;
                    break outer;
                }
            }
        }
        int turns = 5;
       
       
        while (turns > 0) {
            int new_row = row_pos;
            int new_col = col_pos;
            System.out.printf("Enter move %d: ",(6-turns));
            String inp = sc.nextLine();
           
            if (inp.equals("UP")) {
                new_row = row_pos - 1;
            } else if (inp.equals("DOWN")) {
                new_row = row_pos + 1;
            } else if (inp.equals("LEFT")) {
                new_col = col_pos - 1;
            } else if (inp.equals("RIGHT")) {
                new_col = col_pos + 1;
            } else {
                System.out.println("Invalid move. Try again.");
                continue;
            }
           
            if (new_row < 0 || new_row >= row || new_col < 0 || new_col >= col) {
                System.out.println("You fell out of the grid! Game Over.");
                break;
            }
           
            if (arr2D[new_row][new_col] == -1) {
                System.out.println("You stepped on a mine! Game Over.");
                break;
            }
            arr2D[row_pos][col_pos] = 0;
            row_pos = new_row;
            col_pos = new_col;
            arr2D[row_pos][col_pos] = 7;
           
            if (arr2D[row_pos][col_pos] == 10) {
                System.out.println("Congratulations! You found the treasure!");

                break;
            }

           
        System.out.println("Current state:");
            printMap(arr2D);
            turns--;
           
           
           
           
        }
        if (turns == 0) {
            System.out.println("Failed to find the treasure.");
        }
       
       
    }
   
    public static void printMap(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}