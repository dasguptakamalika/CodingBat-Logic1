public int caughtSpeeding(int speed, boolean isBirthday) {
    int limit1 = 60;
    int limit2 = 80;

    if (isBirthday) {
        limit1 += 5;
        limit2 += 5;
    }

    if (speed <= limit1) {
        return 0; // no ticket
    } else if (speed <= limit2) {
        return 1; // small ticket
    } else {
        return 2; // big ticket
    }
}

//A little tough
