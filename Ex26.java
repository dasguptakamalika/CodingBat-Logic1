 public String fizzString2(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
        return "FizzBuzz!";
    } else if (n % 3 == 0) {
        return "Fizz!"; 
    } else if (n % 5 == 0) { 
        return "Buzz!";
    } else {
        return n + "!";
    }
}

//&& first = handle the most specific case before the more general ones.

//Otherwise, your more general check would “catch” the number first and skip the special case.



 

