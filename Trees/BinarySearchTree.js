// Binary Search Tree (BST),also called an ordered orsorted binary tree, is a rootedbinary tree data structurewith the key of each
//  internalnode being greater than allhe keys in the respectivenode's left subtree and lesshan the ones in its rightsubtree.

class Node{
    constructor(){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}

class BinaryTree{

}

function levelorder(root){
    const queue = [];
    queue.push(root);
    while(queue.length) {
    const temp = queue. shift();
    process.stdout.write(temp.data + " ")
    if(temp.left){
        queue.push(temp . left);
    }
    
    if(temp.right){
        queue.push(temp. right);
    }
    
}}
