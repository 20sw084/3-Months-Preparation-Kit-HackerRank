#include <iostream>
#include <string>
using namespace std;

bool checkBeautiful(string s, long long num) {
    string temp = to_string(num);
    while (s.find(temp) == 0) {
        s = s.substr(temp.length());
        num++;
        temp = to_string(num);
    }
    return s.empty();
}

void separateNumbers(string s) {
    bool beautiful = false;
    for (int i = 1; i <= s.length() / 2; ++i) {
        long long num = stoll(s.substr(0, i));
        if (checkBeautiful(s, num)) {
            cout << "YES " << num << endl;
            beautiful = true;
            break;
        }
    }
    if (!beautiful) {
        cout << "NO" << endl;
    }
}

int main() {
    int q;
    cin >> q;
    cin.ignore(); // Consume the newline character after q

    while (q--) {
        string s;
        getline(cin, s);
        separateNumbers(s);
    }

    return 0;
}
