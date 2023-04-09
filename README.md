## Task 1
**Description**: *Find the minimum value of an array*

**Explanation**: Base case: `n=1`, then we return the first element of the array
Otherwise, we compare the `arr[n-1]` element with the recursive execution of the function to which `n=n-1` is passed and return lesser

**Solution**:
```java
    public static int findMinimumInArray(int[] arr, int n) {

        if (n == 1) {
        return arr[0]; 
        }

        int min = findMinimumInArray(arr, n - 1); 
        if (min < arr[n - 1]) {  
        return min;
        } else {
        return arr[n - 1]; 
        }
        }
```
## Task 2
**Description**: *Find the average value of an array*

**Explanation**: Base case: `n=1`, then we return 0. Otherwise, we find sum of elements with recursive calling and divide by number of elements

**Solution**:
```java
    public static double calculateAverage(int[] arr, int n) {
        if (n == 0) {       
        return 0;
        } else {
        return (arr[n-1] + (n-1)*calculateAverage(arr, n-1)) / n;   
        }
        }
}
```
## Task 3
**Description**: *Find is prime number or composite*

**Explanation**: Base case: `i==1`, we return `true`. Then we divide number by sqrt of number, and if our remainder equals to zero, we return `false`. And then, we decrease sqrt of number.

**Solution**:
```java
    public static boolean isPrime(int n, int i) {
        if (i == 1) {
        return true;    
        } else {
        if (n % i == 0) {   
        return false;
        } else {
        return isPrime(n, i - 1);   
        }
        }
        }
```
## Task 4
**Description**: *Find factorial*

**Explanation**: Base case: factorial of `0` and `1` equal to one. Otherwise, we decrease our number and multiply with each other

**Solution**:
```java
        public static int FindFactorial(int n) {
        if (n == 0 || n == 1) {     
        return 1;
        } else {
        return n * FindFactorial(n - 1);    
        }
        }
```
## Task 5
**Description**: *Find fibonacci number*

**Explanation**: Base case: `n <= 1`, if number lesser than one, return itself. Otherwise, call to find the sum of two previous numbers

**Solution**:
```java
    public static int fib(int n) {
        if (n <= 1) {       
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
```
## Task 6
**Description**: *Find a power of n*

**Explanation**: Base case: `n == 0`, every number power of zero - equal to one. Otherwise, we multiply our number power times

**Solution**:
```java
    public static int FindPower(int a, int n) {
        if (n == 0) {   
        return 1;
        }
        return a * FindPower(a, n-1); 
        }
```
## Task 7
**Description**: *Return reverse of array*

**Explanation**: Base case: `first >= last`,

`int temp = arr[first];
arr[first] = arr[last];
arr[last] = temp;` swap first and last element, then we call function and swap our elements from beginning to end


**Solution**:
```java
    public static void WriteReverseOfArray(int[] arr, int first, int last) {
        if (first >= last) {        
        return;
        }
        int temp = arr[first];      
        arr[first] = arr[last];
        arr[last] = temp;

        WriteReverseOfArray(arr, first + 1, last - 1);
        }
```
## Task 8
**Description**: *Return reverse of array*

**Explanation**: In this code, the `LoopForCheck` function takes an input string letter and splits it into an array of individual characters. It then calls the recursive `CheckString` function to check if each character is a digit using the `isNum` helper function. If all characters are digits, it returns `Yes`, otherwise `No`. The `isNum` function checks if a string can be parsed as an integer using `Integer.parseInt` and catches a `NumberFormatException` if it cannot be parsed, returning `false` in that case.

**Solution**:
```java
    public static String LoopForCheck(String letter){
        return CheckString(letter.split(""),0,letter.length());
        }


static String CheckString(String[] arr,int position,int stop){
        if(position<stop){
        if(isNum(arr[position])){
        return CheckString(arr,position+1,stop);
        }else{
        return "NO";
        }
        }
        return "Yes";
        }
        
static boolean isNum(String s){
        try{
        Integer.parseInt(s);
        return true;
        }
        catch (NumberFormatException e){
        return false;
        }
        }

```
## Task 9
**Description**: *Find Binomial Coefficient*

**Explanation**: Base case: `k==0 || k==n` return 1. Otherwise, recursively call method with `n-1` and `k-1`, and `n-1` and `k`, and sum results

**Solution**:
```java
    public static int findBinomialCoefficent(int n, int k) {
        if (k == 0 || k == n) {     
        return 1;
        } else {
        return findBinomialCoefficent(n - 1, k - 1) + findBinomialCoefficent(n - 1, k);     
        }
        }

```
## Task 10
**Description**: *Find GCD of two numbers*

**Explanation**: Base case: `b == 0`. Otherwise, call function with `a % b`(remainder) and second element, and return result

**Solution**:
```java
    public static int findGCD(int a, int b) {
        if (b == 0) {   
        return a;
        } else {
        return findGCD(b, a % b);  
        }
        }

```