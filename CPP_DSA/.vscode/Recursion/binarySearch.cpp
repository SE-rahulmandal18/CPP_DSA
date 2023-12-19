#include <iostream>
using namespace std;

bool isSorted(int size, int arr[])
{
    // base case
    if (size == 0 || size == 1)
    {
        return true;
    }

    if (arr[0] > arr[1])
        return false;

    else
    {
        // recursive call
        bool remainingPart = isSorted(size - 1, arr + 1);
        return remainingPart;
    }
}

int main()
{

    int arr[5] = {2, 10, 6, 8, 9};
    int size = 5;

    bool ans = isSorted(size, arr);

    if (ans)
    {
        cout << "array is sorted" << endl;
    }
    else
    {
        cout << "array is not sorted" << endl;
    }
}