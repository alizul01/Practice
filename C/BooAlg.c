/* File : Aljabar Boolean.c */
/* Penulis : Ali Zulfikar */

#include <stdio.h>
int main ()
{
  int TRUE = 1;
  int FALSE = 0;

  printf("Ini nilai TRUE AND TRUE : %d \n", TRUE && TRUE);
  printf("Ini nilai TRUE AND FALSE : %d\n", TRUE && FALSE);
  printf("Ini nilai TRUE OR TRUE : %d \n", TRUE || FALSE);
  printf("Ini nilai TRUE OR FALSE : %d \n", TRUE || FALSE);
  printf("Ini nilai FALSE OR FALSE : %d \n", FALSE || FALSE);
  printf("Ini nilai NOT True : %d\n", !TRUE); /* Ini adalah negasi kalo di Penalaran Umum */
  printf("Ini nilai NOT FALSE : %d \n", !FALSE);
  return 0;
}