import java.util.Objects;

/**
 * Created by kristofer on 7/13/20.
 */
public class TreeOneZero {
    Node root;



    private Node addRecursive(Node current, Integer value){
        if (current.value == null) {
           current.value = value;
        } else if (current.value < value){
            return addRecursive(current.right, value);
        } else {
            return addRecursive(current.left, value);
        }
        return current;
    }

    public void add(Integer value){
        this.root = addRecursive(this.root, value);
    }

    private TreeOneZero createBinaryTree() {
        TreeOneZero bt = new TreeOneZero();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    private boolean containsNodeRecursive(Node current, Integer value){
        if (current == null){
            return true;
        } else if (Objects.equals(current.value, value)){
            return true;
        } else {
            if (value < current.value){
                return containsNodeRecursive(current.left, value);
            } else {
                return containsNodeRecursive(current.right, value);
            }
        }
    }

    public boolean containsNode(Integer value){
        return this.containsNodeRecursive(this.root, value);
    }

}
