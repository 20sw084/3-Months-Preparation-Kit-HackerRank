#include <iostream>

class Counter {
private:
    int count;

public:
    Counter() : count(0) {} // Constructor initializes count to 0

    void increment() {
        count++;
    }

    void decrement() {
        if (count > 0) {
            count--;
        }
    }

    int getCount() {
        return count;
    }
};

int main() {
    Counter counter;

    counter.increment(); // Increment the counter
    counter.increment();
    counter.increment();

    std::cout << "Count: " << counter.getCount() << std::endl;

    counter.decrement(); // Decrement the counter

    std::cout << "Count: " << counter.getCount() << std::endl;

    return 0;
}
