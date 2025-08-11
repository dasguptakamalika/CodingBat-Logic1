public int dateFashion(int you, int date) {
    if (you <= 2 || date <= 2) {
        return 0; // one of you is very unstylish
    } else if (you >= 8 || date >= 8) {
        return 2; // one of you is very stylish
    } else {
        return 1; // otherwise maybe
    }
}
/*How it works step-by-step
First check for “no” case

If either you or date has style ≤ 2 → return 0.

This comes first because the "no" rule overrides the "yes" rule.

Then check for “yes” case

If either you or date has style ≥ 8 → return 2.

Otherwise it’s “maybe”

If neither extreme is true, return 1.

*/