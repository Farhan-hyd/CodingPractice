#include<iostream>
using namespace std;
int main() {
  
  double Pr;
  cin>>Pr;
  
  float num = 365;
  float denom = 365;
  
  double p =1;
  long long n = 0;
  if(Pr!=1){
  while(p>(1-Pr)){
    
    p=p*num/denom;
    num--;
    n++;
    
  }
  }
  else
  n=366;
  cout<<n;
  
  return 0;
}