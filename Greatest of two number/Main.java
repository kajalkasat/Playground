#include<stdio.h>
int main()
{
  //Type your code here
  int num1,num2,num3;
  scanf("%d",&num1);
  scanf("%d",&num2);
  scanf("%d",&num3);
  if (num1 > num2 )
    printf("num1 is the greatest");
  else if(num1 < num2)
     printf("num2 is the greatest");
  else if (num1 == num2)
    printf("Both number Equal");
  return 0;
}