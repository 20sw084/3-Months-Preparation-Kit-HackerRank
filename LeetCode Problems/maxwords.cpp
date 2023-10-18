//Problem 2114. Maximum Number of Words Found in Sentences.

class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int wdcount1 = 1;
        char ch;
        
        vector<int> count(sentences.size());
        for (int i=0;i<sentences.size();i++) {
            for (int k=0;k<sentences[i].length();k++) {
                ch = sentences[i][k];
                if (ch==' '){
                    wdcount1++;
                }
            }
            count[i] = wdcount1;
            wdcount1 =1;
        }
        
        int max = *max_element(count.begin(), count.end());
        
        return max;
    }
};
