public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    
    // Rule 1: if asleep, never answer
    if (isAsleep) {
        return false;
    }
    
    // Rule 2: if it's morning, only answer if it's mom
    if (isMorning && !isMom) {
        return false;
    }
    
    // Otherwise, answer
    return true;
}
