#include <iostream>
using namespace std;

void sortArray(int *arr, int n){
    // base case
    if(n == 0 || n == 1)
    return;

    // ek case solve krlia - largest element ko end mai rkh dega
    for(int i=0; i<n-1; i++){
        if(arr[i] > arr[i+1]){
            swap(arr[i], arr[i+1]);

        }
    } 

    // recursive call
    sortArray(arr, n-1);

}

int main(){
    int arr[5] = {2, 5, 4, 20, 15};
    
    sortArray(arr, 5);

    for(int i=0; i<5; i++){
        cout<<arr[i]<<" ";
    }
}