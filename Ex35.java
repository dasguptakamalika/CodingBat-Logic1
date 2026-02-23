public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
}

public int round10(int num) {
    int remainder = num % 10;
    if (remainder >= 5) {
        return num + (10 - remainder); // round up
    } else {  
        return num - remainder; // round down
    }
}  
//num = 16, remainder = 6 → (10 - 6) = 4 → 16 + 4 = 20 ✅ rounded up

//num = 25, remainder = 5 → (10 - 5) = 5 → 25 + 5 = 30 ✅ rounded up




