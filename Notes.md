
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
