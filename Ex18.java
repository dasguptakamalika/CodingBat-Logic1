public boolean lessBy10(int a, int b, int c) {
    return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10;
}


/*
Math.abs(a - b) >= 10 doesn’t care which way the difference goes.
public boolean lessBy10(int a, int b, int c) {
    return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10;

    if (a >= b + 10 || a <= b - 10)
        return true;
    else if (b >= c + 10 || b <= c - 10)
        return true;
    else if (c >= a + 10 || c <= a - 10)
        return true;
    else
        return false;
}

*/
