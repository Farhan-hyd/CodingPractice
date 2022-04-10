#include<iostream.h>
#include<algorithm>
#include<math.h>

using namespace std;

long long gcd(long long a,long long b){
	if(b == 0) return a;
	return gcd(b ,a%b);
}

int main() {
  long long count;
  double p,q,d=-2, n, totalcount, e =2, k =0,msg,c,m;
  
  cout << "enter two prime numbers" << endl;
  cin >> p >> q;
  n = p * q;
  
  totalcount = (p-1) * (q-1);
  
  while (e < totalcount) {
  	count = gcd((long long) e, (long long) totalcount);
  	if (count == 1)
  		break;
  	else e++;
  }
  
  cout << "enter the messege to be send" << "\n";
  cin >> msg;
  while (d == -2) {
    if ((1 + (k*totalcount))%e == 0){
      d = (1 + (k*totalcount))/e;
    }
    k++;
  }
  c = pow(msg,e);
  c = fmod(c,n);
  m = fmod(pow(c,d) ,n);

  cout << "encryprted  messege is " << c << endl;
  cout << "decrypted messege is " << m << endl;
}