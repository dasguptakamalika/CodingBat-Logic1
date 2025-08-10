public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend)
  {
    return(cigars>=40);
  }
  else
  {
    return (cigars>=40 && cigars<=60);
  }
  
}
/*Right—isWeekend is just a boolean switch:

Weekend = true: success if cigars ≥ 40; otherwise false.

Weekend = false: success if 40 ≤ cigars ≤ 60; otherwise false.*/

