// public class DSA {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

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

