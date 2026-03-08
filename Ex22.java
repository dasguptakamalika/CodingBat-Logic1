 public String alarmClock(int day, boolean vacation) {
    if((day >= 1 && day <=5) && vacation)
        return "10:00";
    else if((day==0 || day ==6) && vacation) 
        return "off";
    else if((day>=1 && day <=5) && !vacation)
        return  "7:00";
    else if((day ==0 || day==6) && !vacation)
        return "10:00";  
    else
    { 
        return "";
    } 
}

//check out the return type, false (boolean) ≠ "false" (String).

//Your method must return a String, always check the return type
 






