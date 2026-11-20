
# 1. Important Questions Notes : 
## 1.1. Prime number :
```java 
    public static boolean isPrime(int n){
        if(n==2){
            return true ; 
        } else if(n<=1){
            return false ; 
        } else {

            for(int i=2 ; i<=Math.sqrt(n) ; i++){ // Since every number has factor in form of a X b and this a , b are always less equal to than square root of number. So we can reduce the number of iterations by taking square root of number. 

                if(n%i==0){ // since prime number is number with only two factors i.e. 1 and itself. So if we find any other factor then it is not a prime number. 

                    return false ;
                }
            }
        }
        return true ; 
    }
```
## 1.2. Binary to Decimal and Decimal to Binary :
### 1.2.1. Binary to Decimal number : 
```java 
    public static void binToDeci(int bin){
        int pow = 0 ; 
        int deci = 0 ; 
        int temp = bin ; 
        while(bin>0){
            int unit = bin%10 ; 
            bin /= 10 ; 

            deci = deci + unit * (int)Math.pow(2, pow) ; // We multiply the unit digit with 2^pow and increase value of pow each time and then add the result in itself.

            pow ++ ; 
        }
        System.out.println("The Decimal number of "+ temp + " is "+ deci);
    }
```
### 1.2.2. Decimal to Binary number :
There is two method first is simple method but it has a drawback i.e *it can't work above the integer capacity and cause integer overflow for big number.*
Therefore, *To avoid this we use StringBuilder method where we build a string using string.insert(index,value) ;*
```java 
    public static void deciToBin(int deci){
        // int pow = 0 ; 
        StringBuilder binString = new StringBuilder(); 
        // int bin = 0 ; 
        int temp = deci ; 
        while(deci>0){
            int rem = deci % 2 ; 
            deci /= 2 ; 

            // bin = rem * (int)Math.pow(10, pow) + bin ; // M-1 : We multiply the rem by 10^pow and pow is deciding where the rem will be placed in a number.

            // pow ++ ; 

            binString.insert(0, rem) ; // M-2 : This will insert the rem value at index 0 of StringBuilder binString and ultimatly we get the binary number.

        }
        // System.out.println("The Binary number of "+ temp + " is "+ bin);
        System.out.println("The Binary number of "+ temp + " is "+ binString);
    }
```

## 1.3. Palindrome or Not Palindrome :
```java 
    // Method 1 : This method is for String 
    public static void isPalindromeStringBuilderMethod(String str) {

        String rev = new StringBuilder(str).reverse().toString(); // We used StringBuilder which have .reverse() and then convert back into string using toString().

        if (rev.equals(str)) {
            System.out.println("The String is palindrome");
            System.out.println("The palindrome value is : " + rev);
        } else {
            System.out.println("The String is not palindrome");
            System.out.println("The palindrome value is : " + rev);
        }
    }

    // Method 2 : This method is for Integer using mathematical approach 
    public static void isPalindromeIntegerMethod(int n) {
        int rev = 0;

        int Original = n; // This is important since we need the use of n later to check if rev == n or not 

        while (Math.abs(n) > 0) { // Math.abs(integer) will convert negative number into positive number 

            int unit = n % 10;
            n /= 10;

            rev = rev * 10 + unit; // In the rev we don't need to deal with negative number since it is automatically getting handled sincen = I-1 :  unit = -1, rev = -1 I-2 : unit = -2, rev = -12 I-3 : unit = -1, rev = -121 ... SO reverse have negative automatically

        }
        if (rev == Original) {
            System.out.println("The number is palindrome");
            System.out.println("The palindrome value is : " + rev);
        } else {
             System.out.println("The number is not palindrome");
            System.out.println("The palindrome value is : " + rev);           
        }

    }

    // Method 3 : 
    public static void isPalindromeStringMethod(int n) {
        if (n < 0) {

            String rev = new StringBuilder(String.valueOf(n).substring(1)).reverse().toString(); // This method is converting the negative number into string without '-' by using .substring(1) and then reversing it. Then it is converting it back into integer by using .toString(). 

            if (rev.equals(String.valueOf(n).substring(1))) {
                System.out.println("The number is palindrome");
                
                System.out.println("The palindrome value is : " + "-" + rev); // '-' is added before the reversed string to make it a palindrome number.

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
```

## 1.4. Pattern Questions : 

```java 

// # 1.4.1. Inverted star pattern :

// ****
// ***
// **
// * 

// # 1.4.2. Half pyramid pattern :

// 1
// 12
// 123
// 1234

// # 1.4.3. Character pattern : 

// A 
// BC 
// DEF 
// GHIJ

// # 1.4.4. Hollow rectangle pattern :

// *****
// *   *
// *   *
// *****

// # 1.4.5. Inverted & rotated half pyramid pattern :

//    *
//   **
//  ***
// ****

// # 1.4.6. Inverted half pyramid with number pattern :

// 12345
// 1234
// 123
// 12
// 1

// # 1.4.7. Floyd's triangle pattern :

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15 


    public static void invertedStar(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // For next line
        }
        System.out.println(); // This is just to have space in between the different pattern in output.
    }

    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void characterPattern(int n){
        int tracker = 65 ; 
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print((char)tracker);
                tracker ++ ; 
            }
            System.out.println();
        }
        System.out.println();
        
    }

    public static void hollowRectangle(int n){
        for(int i=1 ; i<=n ; i++){
            if(i==1 || i==n){ // line 1 and last line forming here
                for(int j=1 ; j<=n+1 ; j++){
                    System.out.print("*");
                }
            } else { // rest of lines form here 
                for(int j=1 ; j<=n+1 ; j++){
                    if(j==1 || j==n+1){ // this is forming first and last column of a line.
                        System.out.print("*");
                    } else { // rest of column form here
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    public static void invertedRotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void invertedHalfPyramidWithNumber(int n) {
        int tracker = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(tracker);
                tracker++;
            }
            tracker = 1;
            System.out.println();
        }
    }

    public static void floydTriangle(int n) {
        int tracker = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (2 * i + 1); j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                    
                } else {
                    System.out.print(tracker);
                    tracker++;
                }

            }
            System.out.println();
        }
    }
```
