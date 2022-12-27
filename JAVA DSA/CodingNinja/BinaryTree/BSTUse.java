package CodingNinja.BinaryTree;

public class BSTUse {

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(5);
        b.insert(2);
        b.insert(7);
        b.insert(1);
        b.insert(3);
        b.insert(6);
        b.insert(8);

        b.printTree();

        System.out.println(b.isPresent(5));
        b.deleteData();
    }


    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftMax = maximum(root.left);
        if(leftMax >= root.data){
            return false;
        }
        int rightMin = minimum(root.right);
        if(rightMin < root.data){
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        return isLeftBST && isRightBST;
    }

    public static int minimum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static int maximum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
}
