public boolean lastDigit(int a, int b, int c) {
    int aLast = a % 10;
    int bLast = b % 10;
    int cLast = c % 10;

    return (aLast == bLast) || (aLast == cLast) || (bLast == cLast); 
}
/*int num = 347;
int tens = (num / 10) % 10;  
System.out.println(tens); // 4   to access 100th and so on 
*/



