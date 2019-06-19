#include <stdio.h>
int main() {
	int n,temp,sum=0,cube=0,rem=0;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    rem=n%10;
    cube=pow(rem,3);
    sum=sum+cube;
    n=n/10;
  }
  if(sum==temp)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}