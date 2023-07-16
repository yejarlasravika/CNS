#include <stdio.h>
#include <math.h>

int main () {
   double a, b,c;
   a = 9.2;
   b = 3.7;
   c = 2;
   printf("Remainder of %lf / %lf is %lf\n", a, c, fmod(a,c));
   printf("Remainder of %lf / %lf is %lf\n", a, b, fmod(a,b));
   
   return(0);
}
