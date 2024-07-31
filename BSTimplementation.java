class BST {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of the BST
    Node root;

    // Constructor
    BST() {
        root = null;
    }

    // Insert a node
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    // Delete a node
    void delete(int key) {
        root = deleteRec(root, key);
    }

    // A recursive function to delete a node
    Node deleteRec(Node root, int key) {
        // Base case: if the tree is empty
        if (root == null)
            return root;

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        // If key is same as root's key, then this is the node to be deleted
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Search for a node
    boolean search(int key) {
        return searchRec(root, key);
    }

    // A recursive function to search a key in BST
    boolean searchRec(Node root, int key) {
        // Base case: root is null or key is present at root
        if (root == null || root.key == key)
            return root != null;

        // Key is greater than root's key
        if (root.key < key)
            return searchRec(root.right, key);

        // Key is smaller than root's key
        return searchRec(root.left, key);
    }

    // In-order traversal
    void inorder() {
        inorderRec(root);
    }

    // A recursive function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Pre-order traversal
    void preorder() {
        preorderRec(root);
    }

    // A recursive function to do preorder traversal of BST
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Post-order traversal
    void postorder() {
        postorderRec(root);
    }

    // A recursive function to do postorder traversal of BST
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Driver Program to test the above functions
    public static void main(String[] args) {
        BST tree = new BST();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal
        System.out.println("In-order traversal:");
        tree.inorder();
        System.out.println();

        // Print pre-order traversal
        System.out.println("Pre-order traversal:");
        tree.preorder();
        System.out.println();

        // Print post-order traversal
        System.out.println("Post-order traversal:");
        tree.postorder();
        System.out.println();

        // Search for a node
        System.out.println("Search for 40: " + tree.search(40));
        System.out.println("Search for 90: " + tree.search(90));

        // Delete a node
        System.out.println("Delete 20");
        tree.delete(20);
        System.out.println("In-order traversal after deletion:");
        tree.inorder();
        System.out.println();

        System.out.println("Delete 30");
        tree.delete(30);
        System.out.println("In-order traversal after deletion:");
        tree.inorder();
        System.out.println();

        System.out.println("Delete 50");
        tree.delete(50);
        System.out.println("In-order traversal after deletion:");
        tree.inorder();
        System.out.println();
    }
}
