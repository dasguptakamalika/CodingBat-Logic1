public int sumLimit(int a, int b) {
    int sum = a + b;
    if (String.valueOf(sum).length() == String.valueOf(a).length()) {
        return sum; // same number of digits as a
    } else {
        return a; // sum has more digits
    }
}
