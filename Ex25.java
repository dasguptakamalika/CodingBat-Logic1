 public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isAsleep) {
        return false; // never answer if asleep
    }
    if (isMorning && !isMom) {
        return false; // in morning, only answer if mom
    }
    return true; // all other cases  
}

//understand the flow, all cases if ur asllep u aint picking up, then comes next false, if not morning and mom doesnt call, you wont pick up
//rest of the times , u pick up, also if first if is false then we go to next condition
//aaaahh dont get it!!!




 
