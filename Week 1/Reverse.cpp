#include<iostream>
using namespace std;

string reverseWord(string str){
    
 int i = 0;
 int j = str.length() - 1;
 
 while(i <= j) {
     swap(str[i], str[j]);
     
     i++;
     j--;
 }
 
 return str;
}

int main() {

    string str;
    cout << "Enter a string: "; 
    getline(cin, str);
    cout << reverseWord(str);

    return 0;
}
