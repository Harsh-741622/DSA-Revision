// import java.util.Scanner;

// public class DSA {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//     }
// }

// // #1.1. Prime Number till n 
// import java.util.*; 
// public class DSA {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the range till we need to find Prime Number: ");
//         int n = sc.nextInt() ; 
//         System.out.print("The prime number in range "+ n +" : " );
//         printPrimeInRange(n);

//     }
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true ; 
//         } else if(n<=1){
//             return false ; 
//         } else {
//             for(int i=2 ; i<=Math.sqrt(n) ; i++){
//                 if(n%i==0){
//                     return false ;
//                 }
//             }
//         }
//         return true ; 
//     }
//     public static void printPrimeInRange(int n){
//         for(int i=2 ; i<=n ; i++){
//             if(isPrime(i)){
//                 System.out.print(i + " ");
//             }
//         }
//     }

// }

// # 1.2 Binary number to Decimal number and vice versa :

// import java.util.Scanner;

// public class DSA {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Binary Number : ");
//         int bin = sc.nextInt(); 
//         System.out.print("Enter the Decimal Number : ");
//         int deci = sc.nextInt() ; 
//         binToDeci(bin);
//         deciToBin(deci);
//     }
//     public static void binToDeci(int bin){
//         int pow = 0 ; 
//         int deci = 0 ; 
//         int temp = bin ; 
//         while(bin>0){
//             int unit = bin%10 ; 
//             bin /= 10 ; 
//             deci = deci + unit * (int)Math.pow(2, pow) ; 
//             pow ++ ; 
//         }
//         System.out.println("The Decimal number of "+ temp + " is "+ deci);
//     }
//     public static void deciToBin(int deci){
//         // int pow = 0 ; 
//         StringBuilder binString = new StringBuilder(); 
//         // int bin = 0 ; 
//         int temp = deci ; 
//         while(deci>0){
//             int rem = deci % 2 ; 
//             deci /= 2 ; 
//             // bin = rem * (int)Math.pow(10, pow) + bin ; 
//             // pow ++ ; 

//             binString.insert(0, rem) ; 

//         }
//         // System.out.println("The Binary number of "+ temp + " is "+ bin);
//         System.out.println("The Binary number of "+ temp + " is "+ binString);
//     }
// }

// # 1.3. Is palindrome or Not :

import java.util.Scanner;

public class DSA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter : ");
        // String str = sc.next();
        System.out.print("Enter number : ");
        int n = sc.nextInt();

    }

    public static void isPalindromeStringBuilderMethod(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        if (rev.equals(str)) {
            System.out.println("The String is palindrome");
            System.out.println("The palindrome value is : " + rev);
        } else {
            System.out.println("The String is not palindrome");
            System.out.println("The palindrome value is : " + rev);
        }
    }

    public static void isPalindromeIntegerMethod(int n) {
        int rev = 0;
        int Original = n;
        while (Math.abs(n) > 0) {
            int unit = n % 10;
            n /= 10;
            rev = rev * 10 + unit;
        }
        if (rev == Original) {
            System.out.println("The number is palindrome");
            System.out.println("The palindrome value is : " + rev);
        } else {
             System.out.println("The number is not palindrome");
            System.out.println("The palindrome value is : " + rev);           
        }

    }

    public static void isPalindromeStringMethod(int n) {
        if (n < 0) {
            String rev = new StringBuilder(String.valueOf(n).substring(1)).reverse().toString();
            if (rev.equals(String.valueOf(n).substring(1))) {
                System.out.println("The number is palindrome");
                System.out.println("The palindrome value is : " + "-" + rev);
            } else {
                System.out.println("The number is not palindrome");
                System.out.println("The palindrome value is : " + "-" + rev);
            }

        } else {
            String rev = new StringBuilder(String.valueOf(n)).reverse().toString();
            if (rev.equals(String.valueOf(n))) {
                System.out.println("The number is palindrome");
                System.out.println("The palindrome value is : " + rev);
            } else {
                System.out.println("The number is not palindrome");
                System.out.println("The palindrome value is : " + rev);
            }

        }
    }
}