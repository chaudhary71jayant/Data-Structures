
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left,right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
    
}
public class checkCompleteness {
    TreeNode root;

    public checkCompleteness() {
        root = null;
    }

    
    public static void main(String[] args) {
        checkCompleteness tree = new checkCompleteness();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(6);

        if(isComplete(tree.root)){
            System.out.print("The Binary tree is complete");
        } else {
            System.out.print("The binary tree is incomplete binary tree");
        }
    }

    static boolean isComplete(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        boolean null_seen = false;

        while(!q.isEmpty()){
            TreeNode temp = q.poll();

            if(temp == null){
                null_seen = true;
            } else {
                if(null_seen) return false;
                q.offer(temp.left);
                q.offer(temp.right);
            }
        }
        return true;
    }
}

