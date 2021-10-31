/* File : konstanta.c*/

#include <stdio.h>

#define FALSE 0
#define NOL 0
#define SATU 1
#define pi 3.1415
int main()
{
  const int maks = 3;
  const float param = 2.5;
  const char cc = 65;
  const char cA = 'A';

  printf ("PI = %6.2f\n", pi);
  printf ("NOL = %d\n", NOL);
  printf ("SATU = %d\n", SATU);
  printf ("FALSE = %d\n", FALSE);
  printf ("maks = %d\n", maks);
  printf ("param = %0.1f\n", param);
  printf ("cc = %c\n", cc);
  printf ("cA = %c\n", cA);
  return 0;
}
  