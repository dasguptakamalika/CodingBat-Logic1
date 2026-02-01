public boolean squirrelPlay(int temp, boolean isSummer) {
    if (isSummer && temp >= 60 && temp <= 100) {
        return true;
    } else if (!isSummer && temp >= 60 && temp <= 90) {
        return true; 
    } else {
        return false;
    }
}


//MUST CHECK FOR THE NON SUMMER ASWELL, KEEP THE NO. OF PARAMETERS SAME AS THE METHOD SIGNATURE
 
 


 
