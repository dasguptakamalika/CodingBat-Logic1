public boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode) {
        return (n <= 1 || n >= 10);
    } else {
        return (n >= 1 && n <= 10);
    }
}

/*Problem (clarified version)
Given a number n and a boolean outsideMode:

If outsideMode is false → Return true if n is between 1 and 10 inclusive
(n >= 1 && n <= 10),
otherwise return false.

If outsideMode is true → Return true if n is less than or equal to 1
(n <= 1) or greater than or equal to 10 (n >= 10), otherwise return false.*/
