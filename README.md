# Xenosis_it-Solution-Assignment-4

Node Class: Represents a node in the BST with a key, left child, and right child.
BST Class: Contains the root node and methods for inserting, deleting, searching, and traversing the BST.
Insert: Adds a new node to the BST while maintaining the BST properties.
Delete: Removes a node from the BST while maintaining the BST properties. Handles three cases: node with no child, one child, and two children.
Search: Searches for a node with a specific key.
In-order Traversal: Visits nodes in ascending order (left-root-right).
Pre-order Traversal: Visits nodes in the order of root-left-right.
Post-order Traversal: Visits nodes in the order of left-right-root.

 Xenosis_it-Solution-Assignment-5
 Stack Class: Contains an array stackArray to store stack elements, maxSize to define the maximum capacity, and top to track the top index of the stack.
Constructor: Initializes the stack with the given size and sets the top to -1 to indicate an empty stack.
Push: Adds an element to the stack if it's not full. If the stack is full, it prints a message.
Pop: Removes and returns the top element of the stack if it's not empty. If the stack is empty, it prints a message and returns -1.
Peek: Returns the top element of the stack without removing it if the stack is not empty. If the stack is empty, it prints a message and returns -1.
isEmpty: Checks if the stack is empty by comparing the top index to -1.
isFull: Checks if the stack is full by comparing the top index to maxSize - 1.
Main Method:
Demonstrates the usage of the stack by pushing, popping, peeking, and checking if the stack is empty or full.
