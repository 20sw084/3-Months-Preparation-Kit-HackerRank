#include <iostream>
using namespace std;

int main() {
    int score = 0;
    int numQuestions = 3; // You can change this to the number of questions you have.

    // Question 1
    cout << "Question 1: What is 2 + 2?" << endl;
    int answer1;
    cin >> answer1;
    if (answer1 == 4) {
        cout << "Correct!" << endl;
        score++;
    } else {
        cout << "Incorrect. The correct answer is 4." << endl;
    }

    // Question 2
    cout << "Question 2: What is 3 * 5?" << endl;
    int answer2;
    cin >> answer2;
    if (answer2 == 15) {
        cout << "Correct!" << endl;
        score++;
    } else {
        cout << "Incorrect. The correct answer is 15." << endl;
    }

    // Question 3
    cout << "Question 3: What is 10 / 2?" << endl;
    int answer3;
    cin >> answer3;
    if (answer3 == 5) {
        cout << "Correct!" << endl;
        score++;
    } else {
        cout << "Incorrect. The correct answer is 5." << endl;
    }

    // Display final score
    cout << "Your final score is: " << score << " out of " << numQuestions << endl;

    return 0;
}
