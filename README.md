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