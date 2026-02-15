public int blackjack(int a, int b) {
    if (a > 21) a = 0;  // modifies a if it’s over 21
    if (b > 21) b = 0;  // modifies b if it’s over 21

    return Math.max(a, b);  // always runs last
}

 

 

 

 
