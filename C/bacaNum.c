/* File : bacaNum.c */

#include <stdio.h>
int main()
{
  int a;
  float x;
 
  printf ("Contoh membaca dan menulis, ketik nilai integer: ");
  scanf ("%d", &a);
  printf ("Nilai yang dibaca : %d \n", a);

  printf ("Ketik nilai sebuah bilangan riil : ");
  scanf ("%f", &x);
  printf ("Nilai yang dibaca : %0.1f \n", x);

  return 0;
}
