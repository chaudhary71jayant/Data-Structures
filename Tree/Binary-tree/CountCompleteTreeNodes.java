//leetcode 222
class TreeNode{
    int val;
    TreeNode left,right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
    
}
public class CountCompleteTreeNodes {
    TreeNode root;

    public CountCompleteTreeNodes() {
        root = null;
    }
    
    public static void main(String[] args) {
        CountCompleteTreeNodes tree = new CountCompleteTreeNodes();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(6);

        int nodesCount = countNodes(tree.root);

        System.out.print("The number of nodes are : "+ nodesCount);
    }

    static int countNodes(TreeNode root){
        if(root == null) return 0;

        int left = leftCount(root);
        int right = rightCount(root);


        if(left == right) {
            return (1 << left) -1;
        }

        return 1+ countNodes(root.left) + countNodes(root.right);
    }

    static int leftCount(TreeNode root){
        int count =0;
        while(root != null){
            root = root.left;
            count++;
        }
        return count;
    }

    static int rightCount(TreeNode root){
        int count =0;
        while(root != null){
            root = root.right;
            count++;
        }
        return count;
    }
}
