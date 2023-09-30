#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'isValid' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string isValid(string s) {
    map<char, int> char_freq;
    for (char c : s)
        char_freq[c]++;
        
    map<int, int> count_freq;
    for (auto f : char_freq)
        count_freq[f.second]++;
    
    
    if (count_freq.size() == 1)
        return "YES";
    else if (count_freq.size() == 2) {
        auto num1_map = next(count_freq.begin(), 0);
        auto num2_map = next(count_freq.begin(), 1);
        if (num1_map->second == 1 or num2_map->second == 1 and abs(num1_map->first - num2_map->first) == 1)
            return "YES";
    } 
    return "NO";
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = isValid(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
