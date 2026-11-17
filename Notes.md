
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


