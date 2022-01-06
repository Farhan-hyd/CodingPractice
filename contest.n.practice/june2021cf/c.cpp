#include<stdio.h>
#define ll long long int
using namespace std;
int main(){
    int testcase;
    scanf("%d",&testcase);
    while(testcase--){
        int D,d,P,Q;
        scanf("%d%d%d%d",&D,&d,&P,&Q);
        int heist = 0;

        int intr = D / d;

        if (intr%2 == 0) {
            heist = d * ((intr / 2) * (2 * P + ( intr - 1 ) * Q));
            heist += (D % d ) * (P + intr * Q);
        } else {
            heist = d * (intr * ( P + (( intr - 1 ) / 2) * Q));
            heist += (D % d ) * (P + intr * Q); 
        }
        printf("%d",heist);
    }
}