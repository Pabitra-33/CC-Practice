#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	//Roller Coaster
	int T;
	cin>>T;
	for(int i=0;i<T;i++){
	    int X;//chef's son height
	    int H;//required height
	    cin>>X>>H;
	    if(X>=H){
	        cout<<"Yes"<<endl;
	    }
	    else{
	        cout<<"No"<<endl;
	    }
	}
	return 0;
}
