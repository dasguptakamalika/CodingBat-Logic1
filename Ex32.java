public int noTeenSum(int a, int b, int c) {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n) {
    if ((n >= 13 && n <= 19) && n != 15 && n != 16) {
        return 0; // bad teen → counts as 0
    } 
    return n; // not a bad teen → return it as is 
}
 
/*see when there is specific exceptions, we ! them out
VERY IMPORTANT*/



