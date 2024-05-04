class GfG
{
    Node recursion(int in[], int post[], int inStart, int inEnd, int postStart, int postEnd)
    {
        if(inStart > inEnd)
        {
            return null;
        }
        if(inStart == inEnd)
        {
            return new Node(in[inStart]);
        }
        
        Node root = new Node(post[postEnd]);
        
        int ind = -1; //to find the index of the next root element
        for(int i=inStart; i<=inEnd; i++)
        {
            if(in[i] == post[postEnd])
            {
                ind = i;
                break;
            }
        }
        
        //to find the number of elements in the next left and right subtrees
        int leftTreeEleCount = ind - inStart;
        int rightTreeEleCount = inEnd - ind;
        
        root.left = recursion(in, post, inStart, ind-1, postStart, postStart + leftTreeEleCount - 1);
        root.right = recursion(in, post, ind+1, inEnd, postEnd - rightTreeEleCount, postEnd -1);
        
        return root;
    }
    
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        return recursion(in, post, 0, n-1, 0, n-1);
    }
}