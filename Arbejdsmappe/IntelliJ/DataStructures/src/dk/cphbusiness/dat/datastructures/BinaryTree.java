package dk.cphbusiness.dat.datastructures;

public class BinaryTree {
    private TreeNode root;

    public TreeNode addNodeRecursively (TreeNode current, int value) {

        if (current == null) {
            return new TreeNode(value);
        } else {
            if (value < root.getValue()) {
                root.setLeft(addNodeRecursively(current.getLeft(),value));
            }
            else if(value > root.getValue()){
                root.setRight(addNodeRecursively(current.getRight(),value));
            }
        }
        return current;
    }


}
