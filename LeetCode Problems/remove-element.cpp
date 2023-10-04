//https://leetcode.com/problems/remove-element/
//Easy, Time: Beats 100%, Memomry: Beats 19.05%

#include<bits/stdc++.h>
using namespace std;



    int removeElement(vector<int>& nums, int val) {
       int index = 0;
        for(int i = 0; i< nums.size(); i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }


int main(){
vector<int>nums={0,1,2,2,3,0,4,2};
int val = 2;
int k = removeElement(nums, val);
for(int i=0; i<k; i++){
    cout<<nums[i]<<' ';
}
cout<<'\n';
return 0;
}