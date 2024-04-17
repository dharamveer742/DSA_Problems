package Tree;

public class isSameTree {


    public static boolean isSame(Node p,Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.value!=q.value) return false;

        boolean l = isSame(p.left,q.left);
        boolean r = isSame(p.right,q.right);

        return l&&r;
    }


}
