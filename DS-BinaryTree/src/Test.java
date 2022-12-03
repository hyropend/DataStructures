public class Test {
    public static void main(String[] args){

        BTree bt = new BTree();

        bt.root=bt.insert(bt.root,10);
        bt.root=bt.insert(bt.root,8);
        bt.root=bt.insert(bt.root,15);
        bt.root=bt.insert(bt.root,5);
        bt.root=bt.insert(bt.root,12);
        bt.root=bt.insert(bt.root,20);
        bt.root=bt.insert(bt.root,9);

        System.out.print("preOrder: ");
        System.out.print("\n****************************\n");
        bt.preOrder(bt.root);
        System.out.println("\n****************************\n");

        System.out.print("inOrder: ");
        System.out.print("\n****************************\n");
        bt.inOrder(bt.root);
        System.out.println("\n****************************\n");

        System.out.print("postOrder: ");
        System.out.print("\n****************************\n");
        bt.postOrder(bt.root);
        System.out.println("\n****************************\n");

    }
}
