public class BinaryNode<T> {
    T data;
    BinaryNode<T>Left;
    BinaryNode<T>Right;

    public BinaryNode(T data) {
        this.data = data;
    }
}
class Test{
    public static void main(String[] args) {
        // BinaryNode root = new BinaryNode(15);
        BinaryNode<Integer> root = new BinaryNode<>(15);
        BinaryNode<Integer> Rleft = new BinaryNode<>(10);
        BinaryNode<Integer> Rright = new BinaryNode<>(20);
        root.Left = Rleft;
        root.Right = Rright;
        print(root);
    }
        public static void print(BinaryNode root1){
            if(root1 ==null){
                return;
            }
            System.out.println(root1.data);
            print(root1.Left);
            print(root1.Right);
        }
    }



