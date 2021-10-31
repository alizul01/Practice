/* File : max.c */
/* Penulis : Ali Zulfikar */

#include <stdio.h>
int main()

{
  printf("================================\n");
  int i;
  int a;
  int Tab[10] = {2, 50, 6, 20, 3, 100, 30, 8, 99, 100};
  int max;
  int min;

  min = Tab[0];
  for (i=0; i<10; i++)
  {
    if (Tab[i] < min)
    {
      min = Tab[i];
    }
  } 
  printf ("Nilai min = %d \n", min);
  printf ("---------------\n");

  max = Tab[0];
   for (a=0; a<10; a++)
  {
    if (Tab[a] > max)
    {
      min = Tab[a];
    }
  } 
  printf ("Nilai max = %d \n", min);
  printf ("================================\n");
  printf("rata-rata nilai adalah : %d \n", ((max)+(min))/2);
  printf ("================================\n");
  return 0; 
}
  