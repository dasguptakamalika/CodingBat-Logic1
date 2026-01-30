public int makeChocolate(int small, int big, int goal) {
    // Maximum number of big bars we can use without exceeding goal
    int bigBarsToUse = Math.min(goal / 5, big);
    
    // Remaining weight after using big bars
    int remaining = goal - (bigBarsToUse * 5);
    
    // Check if we have enough small bars  to cover the remaining weight
    if (remaining <= small) {
        return remaining; // number of small bars to use
    } else { 
        return -1; // can't be done
    } 
} 

//bigFirst → leftover → check smalls
/*int useBig = Math.min(goal / 5, big);
int left = goal - useBig * 5;
if (left <= small) return left;
return -1;
The reason it returns -1 instead of false is because the method’s return type is int, not boolean.
*/





 

