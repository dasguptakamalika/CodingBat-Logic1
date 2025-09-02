public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if (noDoubles && die1 == die2) {
        if (die1 == 6) {
            die1 = 1; // wrap around from 6 to 1
        } else {
            die1 = die1 + 1; // otherwise just add 1
        }
    } 
    return die1 + die2; 
}


