import java.util.*;

public class Single_Expression_Integer_Calculator { 
    
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to basic Calc");
        System.out.println("Enter Input (e.g:23+7)");
        StringBuilder str = new StringBuilder(sc.next());
        boolean flag = true;

        // Using StringBuilder for better performance
        StringBuilder a = new StringBuilder();
        StringBuilder ch = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9' && flag == true) {
                a.append(str.charAt(i));
            } else if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                flag = false;
                ch.append(str.charAt(i));
            } else {
                b.append(str.charAt(i));
            }
        }


        int res=0;

        if(ch.length()==0){
            System.out.println("Invalid Operator!");
            return ;
        }

        char operator=ch.charAt(0);
        int num1=Integer.parseInt(a.toString());
        int num2=Integer.parseInt(b.toString());

        if (operator=='+') {
            res = addition(num1, num2);
        } else if (operator=='-') {
            res = subtraction(num1, num2);
        } else if (operator=='*') {
            res = multiplication(num1, num2);
        }
        else if (operator=='/') {
            if (num2==0) {
                System.out.println("Infinity!");
                return ;
            } else {
                res = division(num1, num2);
            }
        }

        // Printing final result
        System.out.print("Result is: " + res);
    }
}
