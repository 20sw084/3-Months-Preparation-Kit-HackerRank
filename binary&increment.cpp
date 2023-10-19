#include <iostream>
#include <vector>
#include <algorithm>

// Function to increment each element of an array by a given value
void incrementArray(std::vector<int>& arr, int incrementValue) {
    for (int& num : arr) {
        num += incrementValue;
    }
}

// Function to perform binary search on a sorted array
int binarySearch(const std::vector<int>& arr, int target) {
    int left = 0;
    int right = arr.size() - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Element found, return its index
        }

        if (arr[mid] < target) {
            left = mid + 1; // Search the right half
        } else {
            right = mid - 1; // Search the left half
        }
    }

    return -1; // Element not found
}

int main() {
    std::vector<int> arr = {1, 3, 5, 7, 9};
    int incrementValue = 2;
    int target = 7;

    // Increment all elements of the array
    incrementArray(arr, incrementValue);

    std::cout << "Array after incrementing by " << incrementValue << ": ";
    for (int num : arr) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    // Sort the array (in case it's not already sorted)
    std::sort(arr.begin(), arr.end());

    // Perform a binary search
    int result = binarySearch(arr, target);

    if (result != -1) {
        std::cout << "Element " << target << " found at index " << result << std::endl;
    } else {
        std::cout << "Element " << target << " not found in the array." << std::endl;
    }

    return 0;
}
