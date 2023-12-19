#include <iostream>
using namespace std;

void print(int arr[] ,int n){
    cout<<"the size of array is :"<<n <<endl;

    for(int i=0; i<n; i++){
        cout<< arr[i]<<" ";
    }cout<<" "<<endl;
}

bool linearSearch(int arr[], int size, int k)
{    
    print(arr, size);
    // base case
    if (size == 0)
        return false;

    if (arr[0] == k){
        return true;

    }else
    {
        // recursive call
        bool remainingPart = linearSearch(arr+1, size-1, k);
        return remainingPart;
    }
}

int main()
{
    int arr[5] = {2, 5, 1, 40, 9};
    int size = 5;
    int k = 9;

    bool ans = linearSearch(arr, size, k);

    if(ans){
        cout<<"key found"<<endl;
    }else{
        cout<<"key not found"<<endl;
    }
}