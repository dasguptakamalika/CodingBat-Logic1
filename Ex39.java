public int makeChocolate(int small, int big, int goal) {
    // Maximum number of big bars we can use without exceeding goal
    int bigBarsToUse = Math.min(goal / 5, big);

    // Remaining weight after using big bars
    int remaining = goal - (bigBarsToUse * 5);

    // Check if we have enough small bars to cover the remaining weight
    if (remaining <= small) {
        return remaining; // number of small bars to use
    } else {
        return -1; // can't be done
    }
}
