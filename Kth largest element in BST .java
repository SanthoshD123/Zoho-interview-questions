class Solution {
    int count = 0; // Counter to keep track of the number of visited nodes
    int result = -1; // Variable to store the Kth largest element
    
    // Function to perform reverse in-order traversal
    private void reverseInorder(Node node, int K) {
        if (node == null || count >= K) {
            return;
        }
        
        // Recur on the right subtree
        reverseInorder(node.right, K);
        
        // Increment the count of visited nodes
        count++;
        
        // If we have visited K nodes, store the Kth largest element
        if (count == K) {
            result = node.data;
            return;
        }
        
        // Recur on the left subtree
        reverseInorder(node.left, K);
    }
    
    // Function to return the Kth largest element
    public int kthLargest(Node root,int K)
    {
        count = 0; // Reset the count before each query
        result = -1; // Reset the result before each query
        
        reverseInorder(root, K);
        
        return result;
    }
}
