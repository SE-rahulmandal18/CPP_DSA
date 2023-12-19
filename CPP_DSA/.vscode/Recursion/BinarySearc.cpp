#include <iostream>
using namespace std;

void print(int arr[], int s, int e){
    
    for(int i=s; i<=e; i++){
        cout<<arr[i]<<" ";
    }cout<<endl;
}

bool binarySearch(int arr[], int s, int e, int k){
    cout<<endl;
    print(arr, s, e);

    // base case

    // element not found
    if(s>e)
    return false;

    int mid = s + (e-s)/2;
    // element found
    if(arr[mid] == k)
    return true;

    if(arr[mid] < k){
        //right vle part mai jao
        return binarySearch(arr, mid+1, e, k);
    }else{
        //left vle part mai jao
        return binarySearch(arr, s, mid-1, k);
    }
}

int main() {
    int arr[6] = {2, 4, 6, 10, 14, 16};
    int size = 6;
    int k = 40;

    bool ans = binarySearch(arr, 0, 5, k);

    if(ans){
        cout<<"key found"<<endl;
    }else{
        cout<<"key not found"<<endl;
    }
}