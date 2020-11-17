#include<stdio.h>
int main()
{
   char NAME;
   double TOTAL_SALARY,SALARY,TOTAL;
   scanf("%s",&NAME);
   scanf("%lf",&SALARY);
   scanf("%lf",&TOTAL_SALARY);

   TOTAL = SALARY + TOTAL_SALARY * 0.15;
   printf("TOTAL = R$ %.2lf\n", TOTAL);

   return 0;
}
