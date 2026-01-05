public int sumLimit(int a, int b) {
    int sum = a + b;
    if (String.valueOf(sum).length() == String.valueOf(a).length()) {
        return sum; // same number of digits as a
    } else {
        return a; // sum has more digits
    }
} 
 
//of course the sum cannot have lesss digits than its numbers right?
// (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)


