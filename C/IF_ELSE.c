/* File IF_ELSE.c */
/* Penulis : Ali Zulfikar */

#include <stdio.h>
int main()
{
  int a;

  printf("Contoh IF dua kasus \n");
  printf("Ketikkan suatu nilai integer : ");
  scanf("%d", &a);
  
  if(a>=0)
  {
    printf("Nilai %d bernilai positif \n", a);
  }
  else
  {
    printf("Nilai %d bernilai negatif \n", a);
  }
  return 0;
}