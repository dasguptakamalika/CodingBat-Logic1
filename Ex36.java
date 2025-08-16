public boolean evenlySpaced(int a, int b, int c) {
    // First, put a, b, c in order: small ≤ medium ≤ large
    int small = Math.min(a, Math.min(b, c));
    int large = Math.max(a, Math.max(b, c));
    int medium = a + b + c - small - large; // middle value

    // Check if the differences are equal
    return (medium - small) == (large - medium);
}
