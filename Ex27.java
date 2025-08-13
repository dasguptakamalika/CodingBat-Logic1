public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (equalOk) {
        return a <= b && b <= c; // equality allowed
    } else {
        return a < b && b < c; // strict increasing
    }
}
