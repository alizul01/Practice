/* File : IF_ELSE_IF.c */
/* Penulis : Ali Zulfikar */

#include <stdio.h>
int main ()
{
  int a;

  printf("Contoh if tiga kasus \n");
  printf("Ketikkan suatu nilai integer : ");
  scanf("%d", &a);
  if (a>0)
  {
    printf("Nilai %d bernilai positif \n", a);
  }
  else if (a==0)
  {
    printf("Nilai tersebut (%d) adalah nol \n", a);
  }
  else
  {
    printf ("Nilai %d bernilai negatif \n", a);
  }
  return 0;
}