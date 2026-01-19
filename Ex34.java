public int loneSum(int a, int b, int c) {
    int sum = 0;

    if (a != b && a != c) sum += a; // a counts only if unique
    if (b != a && b != c) sum += b; // b counts only if unique
    if (c != a && c != b) sum += c; // c counts only if unique 

    return sum;
}  

 

 
 

