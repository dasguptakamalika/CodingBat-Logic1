public int caughtSpeeding(int speed, boolean isBirthday) {
    // On birthday, increase speed limit by 5
    if (isBirthday) {
        speed -= 5;
    }
    
    if (speed <= 60) {
        return 0; // no ticket
    } else if (speed <= 80) {
        return 1; // small ticket
    } else {
        return 2; // big ticket
    }
}
//That means when you reach the else if, the speed >= 60 part is always true, so it’s useless to check it again.
/*Test 1: caughtSpeeding(60, false)
isBirthday = false → skip speed -= 5

speed = 60 → ≤ 60 → return 0

Test 2: caughtSpeeding(65, false)
isBirthday = false

speed = 65 → falls in >60 && ≤80 → return 1

Test 3: caughtSpeeding(65, true)
isBirthday = true → speed -= 5 → 65 → 60

speed = 60 → ≤ 60 → return 0

 */
