package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class serializeAndDeserialize {

    public static String serialize(Node root){
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node current = q.poll();
            if(current==null){
                sb.append("#,");
            }
            else{
                sb.append(current.value).append(",");
                q.offer(current.left);
                q.offer(current.right);
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static Node deserialize(String data){
        if(data=="") return null;
        Queue<Node> q = new LinkedList<>();
        String[] values = data.split(",");
        Node root = new Node(Integer.parseInt(values[0]));
        q.offer(root);
        for(int i=1;i<values.length;i++){
            Node p =q.poll();
            if(!values[i].equals("#")){
                p.left = new Node(Integer.parseInt(values[i]));
            }
            if(!values[++i].equals("#")){
                p.right = new Node(Integer.parseInt(values[i]));
            }
        }
        return root;
    }
}
