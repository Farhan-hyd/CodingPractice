#include <bits/stdc++.h>
using namespace std;

bool Sort(string a, string b){
	if (a.compare(0, b.size(), b) == 0 || b.compare(0, a.size(), a) == 0)
		return a.size() > b.size();
	else
		return a < b;
}


int main(){
	vector<string> v;
    int size;
    String input;
    cin>>size;

    for(int i=0 ; i < size ;i++){
        cin >> input;
        v1.push_back(input);
    }

	sort(v.begin(), v.end(), Sort);

	for (auto st : v)
		cout << st << endl;

	return 0;
}
