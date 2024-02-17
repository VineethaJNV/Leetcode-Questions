import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxLevelSumOfBinTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void leverOrder(Node root){
        List<Integer>result = new ArrayList<>();
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum = 0;
        while(! q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    result.add(sum);
                    break;
                }else{
                    result.add(sum);
                    sum = 0;
                    q.add(null);
                }
            }else{
                sum += curr.data;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }

            }
        }
        System.out.print(result);
        int max = Integer.MIN_VALUE;
        int level = 0;
        for(int i = 0 ; i < result.size(); i++){
            if(result.get(i) > max){
                max = result.get(i);
                level = i;
            }
        }
        System.out.println(level );
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(7);
        root.right = new Node(0);
        root.left.left = new Node(7);
        root.left.right = new Node(-8);
        leverOrder(root);
        
    }
}
