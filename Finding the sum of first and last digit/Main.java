#include <stdio.h>
int main() {
	int n,fd,ld,temp,s;
  scanf("%d",&n);
  ld=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  fd=n;
  s=fd+ld;
  printf("%d",s);
	return 0;
}