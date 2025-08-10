public boolean lastDigit(int a, int b, ont c)
{
    int al = a%10;
    int bl =b%10;
    int cl= c%10;

    return ( al == bl || bl ==cl || cl==al);
}
