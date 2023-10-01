//https://leetcode.com/problems/next-permutation/
//Medium, Time: 18.73%, Memomry: 

#include<bits/stdc++.h>
using namespace std;



    void nextPermutation(vector<int>& nums) {
        
        int n = nums.size();
        int k = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                k=i; break;
            }
        }
        if(k==-1){reverse(nums.begin(), nums.end()); return;}
        for(int i=n-1; i>=k; i--){
            if(nums[i]>nums[k]){
                swap(nums[i],nums[k]);
                break;
            }
        }
        reverse(nums.begin()+k+1, nums.end());
       
        
        
    }


int main(){
vector<int>nums={1,1,5};
nextPermutation(nums);
for(int n: nums){
    cout<<n<<' ';
}
cout<<'\n';

}