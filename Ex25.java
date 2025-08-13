public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isAsleep) {
        return false; // never answer if asleep
    }
    if (isMorning && !isMom) {
        return false; // in morning, only answer if mom
    }
    return true; // all other cases
}
