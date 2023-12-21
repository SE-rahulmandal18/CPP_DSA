#include <iostream>
using namespace std;

class Node {
    public:
    int data;
    Node* next;

    Node(int data) {
        this -> data = data;
        this -> next = NULL;
    }

};

void insertAtHead(Node* &head, int data){
    //jb data ayega tb new node(temp name ka) create krna hoga 
    Node* temp = new Node(data);

    temp -> next = head;
     head = temp;

}

void insertAtTail(Node* &tail, int data){
    // create a new node
    Node* temp = new Node(data);

    tail -> next = temp;
    tail = temp;
}



void print(Node* &head){
    Node* temp = head;

    while(temp != NULL){
        cout<< temp -> data << " ";
        temp = temp -> next;
    }cout<<endl;
}

void insertAtPostion(Node* &tail, Node* &head, int pos, int data){
    // insert at start
    if(pos == 1) {
        insertAtHead(head, data);
        return;
    }
    
    
    Node* temp = head;
    int count = 1;

    while(count < pos-1){
        temp = temp -> next;
        count ++;
    }
    // insert at last pos
    if(temp -> next == NULL){
        insertAtTail(tail, data);
        return;
    }
    // create new node for data
    Node* nodeToInsert = new Node(data);

    nodeToInsert -> next = temp -> next;
    temp -> next = nodeToInsert;

}


int main(){

    Node* node1 = new Node(10);

   
    // head pointed to node1
    Node* head = node1;
    Node* tail = node1;
    print(head);

    insertAtTail(tail, 12);
    print(head);

    insertAtTail(tail, 15);
    print(head);
    
    insertAtPostion(tail, head, 4, 22);
    print(head);

    cout<<"head "<< head -> data <<endl;
    cout<<"tail "<< tail -> data <<endl;
}