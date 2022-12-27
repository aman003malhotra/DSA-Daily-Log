package CodingNinja.BinaryTree;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;


public class BinaryTreeUse {
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//        root.left = rootLeft;
//        root.right = rootRight;
//        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//        rootLeft.right = twoRight;
//        rootRight.left = threeLeft;
//
//        printTreeDetailed(root);

        int in[] = {4,2,5,1,3};
        int pre[] = {1,2,4,5,3};
        BinaryTreeNode<Integer> root = buildTreeFromPreIn(in, pre);
        printTreeDetailed(root);


    }

    public static void printTree(BinaryTreeNode<Integer> root) {

        if(root == null){
            return;
        }
        System.out.println(root.data);

        printTree(root.left);
        printTree(root.right);
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {

        if(root == null){
            return;
        }
        System.out.print(root.data);
        System.out.print(" : ");
        if(root.left != null){
            System.out.print("L" + root.left.data + " ");
        }
        if(root.right != null){
            System.out.print("R" + root.right.data + " ");
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static BinaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter the data");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static BinaryTreeNode<Integer> takeTreeInputLevelwise(boolean isRoot, int parentData, boolean isLeft ){
        if(isRoot){
            System.out.println("Enter the data");
        } else {
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            }else{
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputLevelwise(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputLevelwise(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static int numNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftNodeCount = numNodes(root.left);
        int rightNOdeCount = numNodes(root.right);
        return 1+leftNodeCount +rightNOdeCount;
    }

    public static int nodeWithLargestData(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int largestLeft = nodeWithLargestData(root.left);
        int largestRight = nodeWithLargestData(root.right);
        return Math.max(root.data,Math.max(largestLeft, largestRight));
    }

    public static int numLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return  numLeaves(root.left) +  numLeaves(root.right);

    }

    public static void printNodesAtdepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }

        if(k == 0){
            System.out.println(root.data);
            return;
        }
        printNodesAtdepthK(root.left, k-1);
        printNodesAtdepthK(root.right, k-1);
    }

    // REMOVES LEAF NODES
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        boolean isRightBalanced = isBalanced(root.left);
        boolean isLeftBalanced = isBalanced(root.left);

        return isLeftBalanced && isRightBalanced;
    }

//    public static BalancedTreereturn isBalancedBetter(BinaryTreeNode<Integer> root){
//        if(root == null){
//            int height = 0;
//            boolean isBal = true;
//            BalancedTreereturn ans = new isBalancedBetter();
//        }
//    }
    public static int  height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+ Math.max(leftHeight , rightHeight);
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();

        pendingChildren.add(root);
        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter the left child" + front.data);
            int left = s.nextInt();
            if (left != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter the left child" + front.data);
            int right = s.nextInt();
            if (right != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(left);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }

        }
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreeFromPreIn(int pre[], int in[]){
        BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length-1, 0, in.length-1);
        return null;
    }

    public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int pre[], int in[], int siPre, int eiPre, int siIn, int eiIn){
        if(siPre > eiPre){
            return null;
        }
        int rootData = pre[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        int rootIndex = -1;
        for(int i = siIn; i < eiIn; i++ ){
            if(in[i] == rootData){
                rootIndex = i;
                break;
            }
        }

        int siPreLeft = siPre+1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;
        int siInRight = rootIndex + 1;
        int eiPreRight = eiPre;
        int eiInRight = eiIn;


        int leftSubtreeLength = eiInLeft - siInLeft + 1;
        int eiPreLeft = siPreLeft + leftSubtreeLength - 1;
        int siPreRight = eiPreLeft + 1;

        BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
        root.left = left;
        root.right = right;
        return root;
    }
}
