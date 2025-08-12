public int redTicket(int a, int b, int c) {
    int result =0;
    if(a != b && a !=c)
        return result = 1;
    else if(a==2 && b==2 && c==2)
    {
        return result = 10;
    }
    else if(a==b && b==c)
        return result = 5;
    else
    {
        return result;
    }
}
