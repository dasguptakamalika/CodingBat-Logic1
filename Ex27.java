public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (equalOk) {
        return a <= b && b <= c; // equality allowed
    } else {
        return a < b && b < c; // strict increasing
    }
} 
 

//see how the specific case was handled first
//also we know how to check if all are equal, a ==b && b==c  
//hence to approve cases like 445 etc , we take this case
//a <=b && b<=c




