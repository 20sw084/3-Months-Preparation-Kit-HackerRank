#include <bits/stdc++.h>
using namespace std;

bool find132pattern(vector<int> &nums)
{
    // monotonic dec stack
    if (nums.size() < 3)
    {
        return false;
    }
    stack<int> stk;
    vector<int> min_array(nums.size());
    min_array[0] = nums[0];

    for (int i = 1; i < nums.size(); i++)
    {
        min_array[i] = min(min_array[i - 1], nums[i]);
    }
    for (int j = nums.size() - 1; j > 0; j--)
    {
        if (nums[j] <= min_array[j])
        {
            continue;
        }
        while (!stk.empty() and stk.top() <= min_array[j])
        {
            stk.pop();
        }
        if (!stk.empty() and stk.top() < nums[j])
        {
            return true;
        }
        stk.push(nums[j]);
    }
    return false;
}
int main()
{
    vector<int> nums = {3, 1, 4, 2};
    cout << find132pattern(nums) << endl;
    return 0;
}