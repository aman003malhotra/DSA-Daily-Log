package CodingNinja.BinaryTree;
import java.util.*;

public class MorrisTraversal{
    public static void main(String[] args) {
        
    }
    // Time Complexity
    // O(N)
    
    public static ArrayList<Integer> getInorder(BinaryTreeNode<Integer> root){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BinaryTreeNode<Integer> curr = root;
        while(curr != null){
            if(curr.left == null){
                arr.add(curr.data);
                curr = curr.right;
            }else{
                BinaryTreeNode<Integer> prev = curr.left;
                while(prev.right!=null && prev.right != curr){
                    prev = prev.right;
                }

                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }else{
                    prev.right = null;
                    arr.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        
        return arr;
    }


    public static ArrayList<Integer> getPreorder(BinaryTreeNode<Integer> root){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BinaryTreeNode<Integer> curr = root;
        while(curr != null){
            if(curr.left == null){
                arr.add(curr.data);
                curr = curr.right;
            }else{
                BinaryTreeNode<Integer> prev = curr.left;
                while(prev.right!=null && prev.right != curr){
                    prev = prev.right;
                }

                if(prev.right == null){
                    prev.right = curr;
                    arr.add(curr.data);
                    curr = curr.left;
                }else{
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }
        
        return arr;
    }
} 
