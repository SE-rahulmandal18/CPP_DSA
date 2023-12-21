#include <iostream>
using namespace std;

class Node {
    public:
    int data;
    Node* next;

    // constructor
    Node(int data) {
        this -> data = data;
        this -> next = NULL;
    }

    // destructor
    ~Node() {
        int value = this -> data;
        //memory free
        if(this -> next != NULL){
            delete next;
            this -> next = NULL;
        }
        cout<<"Memory is free for node with data:"<< value <<endl;
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

void deleteNode(int pos, Node* &head){
    // delete 1st start node
    if(pos == 1){
        Node* temp = head;
        head = head -> next;
        // memory free
        temp -> next = NULL;
        delete temp;
    }
    else{
        // delete at middle or last node
        Node* curr = head;
        Node* prev = NULL;
        
        int count = 1;
        while(count < pos){
            prev = curr;
            curr = curr -> next;
            count++;
        }
 
        prev -> next = curr -> next;
        // memory free
        curr -> next = NULL;
        delete curr;

    }
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

    deleteNode(2, head);
    print(head);


}