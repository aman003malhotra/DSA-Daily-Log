package CodingNinja.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelwise {
    public static void main(String[] args) {
    TreeNode<Integer> root = takeInput();
    printTreeBetter(root);
    }

    public static TreeNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
        System.out.println("Enter the root data");
        int rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.add(root);
        
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter the number of children for " + front.data);
            int numChild = s.nextInt();
            for(int i = 1; i <= numChild; i++){
                System.out.println("Enter the"+ i +" data for child of" + front.data);
                int childData = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
                front.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }

    public static void printTreeBetter(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + ":");
        for(int i =0; i <root.children.size(); i++){

            System.out.print(root.children.get(i).data + " ");
        
        }
        System.out.println();
        // .size() becomes the base case 

        for(int i =0; i <root.children.size(); i++){
            TreeNode<Integer> child = root.children.get(i);
            printTreeBetter(child);

        }
    }
}
