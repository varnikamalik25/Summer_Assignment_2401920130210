import java.util.*;

public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }
        sb.append(root.val).append(",");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    int index = 0;

    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        index = 0;
        return build(values);
    }

    private TreeNode build(String[] values) {
        if (values[index].equals("N")) {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(values[index]));
        index++;
        root.left = build(values);
        root.right = build(values);

        return root;
    }
}
