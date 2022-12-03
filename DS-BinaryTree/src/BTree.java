public class BTree {

    Node root;

    public BTree(){
        root=null;
    }

    Node newNode(int data){
        root = new Node(data);
        return root;
    }

    Node insert(Node root,int data){
        if(root!=null){
            if(data < root.data)
                root.left=insert(root.left,data);
            else
                root.right=insert(root.right,data);
        }
        else
            root=newNode(data);
        return root;
    }

    // ROOT, LEFT, RIGHT
    void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // LEFT, RIGHT, ROOT
    void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+ " ");
        }
    }

    // LEFT, ROOT, RIGHT
    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
    }

    int height(Node root){
        if(root==null)
            return -1;
        else{
            int left=0;
            int right=0;

            left=height(root.left);
            right=height(root.right);

            if(left>right)
                return left+1;
            else
                return right+1;
        }
    }

    int size(Node root){
        if(root==null)
            return 0;
        else{
            return size(root.left) + size(root.right) + 1;
        }
    }
}









