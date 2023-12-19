#include <iostream>
using namespace std;

int factorial(int n)
{
    // base case
    if (n == 0)
        return 1;

        // int smallProblem = factorial(n-1);
        // int bigProblem = n * smallProblem;

    return n * factorial(n - 1);
}

int main()
{

    int n;
    cout << "enter the value of n" << endl;
    cin >> n;

    int ans = factorial(n);

    cout << "factorial of n is:" << ans << endl;

    return 0;
}