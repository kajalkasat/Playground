#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  
if ((n>=1)&&(n<=5))
    {
    if (n==1){
        printf("One");}
        
      else if(n==2){
  
    
        printf("Two");}
      
      else if(n==3){
        printf("Three");}
      
      else if(n==4){
        printf("Four");}
      
      else if(n==5){
        printf("Five");}
    }  
  else if(n>5){
    printf("Invalid");}
  return 0;
}