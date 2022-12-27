package CodingNinja.BinaryTree;

public class BinarySearchTree {
    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x){
        if(node == null){
            return false;
        }
        if(node.data == x){
            return true;
        }
        if(x<node.data){
            return isPresentHelper(node.left, x);
        }else{
            return isPresentHelper(node.right, x);
        }
    }
    public boolean isPresent(int x){
        return isPresentHelper(root, x);

    }

    public void insert(int x){
        return;
    }

    public boolean delete(int x){
        return true;
    }
    private static void printTreeHelper(BinaryTreeNode<Integer> node){
        if(node == null){
            return;
        }
        System.out.print(node.data);
        System.out.print(" : ");
        if(node.left != null){
            System.out.print("L" + node.left.data + " ");
        }
        if(node.right != null){
            System.out.print("R" + node.right.data + " ");
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
    public void printTree(){
        printTreeHelper(root);
    }

    public void  deleteData(){
        return;
    }


}
