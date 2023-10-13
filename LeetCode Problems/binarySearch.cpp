#include<iostream>
using namespace std;

class Solution {
public:
    int search(int nums[], int target, int size) {
        
        int start = 0;
        int end = size - 1;
        
        while(start <= end) {
            
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target) {
                return mid;
            }
            
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            
            else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
    
};


	    int main() {
    	
    	Solution s;
    	
    	int size;
    	cout << "Enter the size: \n";
    	cin >> size;
    	
    	int nums[size];
    	cout << "Enter the elements of an array: (no repeated elements)";
    	
    	for(int i = 0; i < size; i++) {
    		cin >> nums[i];
		}
		
		int target;
		cout << "Enter target: ";
		cin >> target;
		
		cout << target << " is at index: " << s.search(nums, target, size);
		
		return 0;
	}
