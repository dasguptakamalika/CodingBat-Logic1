 public int greenTicket(int a, int b, int c) {
    if (a == b && b == c) {
        return 20; // all same
    } else if (a == b || b == c || a == c) {
        return 10; // exactly two same
    } else {
        return 0; // all different
    }
}
 

 

 

 
