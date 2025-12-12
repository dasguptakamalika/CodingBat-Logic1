public boolean more20(int n) {
    return (n % 20 == 1 || n % 20 == 2);
}

 
/*1️⃣ 43

43 % 20 = 3 → remainder is 3 → ❌ false (it’s +3 from 40, not +1 or +2)

2️⃣ 51

51 % 20 = 11 → remainder is 11 → ❌ false (it’s +11 from 40)

3️⃣ 33

33 % 20 = 13 → remainder is 13 → ❌ false (it’s +13 from 20)

4️⃣ 29

29 % 20 = 9 → remainder is 9 → ❌ false (it’s +9 from 20)
 if the number is smaller than the divisor (and can’t be divided even once), then the remainder is just the number itself.

*/


