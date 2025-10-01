public boolean makeBricks(int small, int big, int goal) {
    return (small + big * 5 >= goal && goal % 5 <=small );
}

//Small-first could leave a remainder that’s
//bigger than 5 and can’t be filled with the big bricks,

/*Example: goal = 9, small = 4, big = 2

If you start with small bricks first:
Use 4 small bricks → 4 inches.
Remaining = 5 inches. Great, one big brick fits. Works here… but that’s just luck.

If you start with big bricks first:
Use 1 big brick (5 inches). Remaining = 4 inches.
Small bricks can cover exactly 4 inches. f you don’t have enough small bricks to fill that leftover → return false.Also works.*/
