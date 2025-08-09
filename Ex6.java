public int teaParty(int tea, int candy) {
    if (tea < 5 || candy < 5) {
        return 0; // bad party
    } else if (tea >= 2 * candy || candy >= 2 * tea) {
        return 2; // great party
    } else {
        return 1; // good party
    }
}
