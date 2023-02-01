package nonprimarydatastucture;
public  class BinarySearchTree {
    public class Node {
        Node left, right;
        int key;
        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
    Node root;
    BinarySearchTree() {
        root = null;
    }
    BinarySearchTree(int value){
        root=new Node(value);
    }
    void insert(int key){
        root=insertRec(root,key);
    }
    Node insertRec(Node root , int key){
        if (root==null){
            root = new Node(key);
            return root;
        } else if (key<root.key) {
            root.left=insertRec(root.left,key);
        } else if (key> root.key) {
            root.right=insertRec(root.right,key);
        }
        return  root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if (root!=null){
            inorderRec(root.left);
            System.out.println(root.key+"  ");
            inorderRec(root.right);
        }
    }

}






