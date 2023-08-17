package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class _0HashMap<K,V> {   // generic support so it can contain any type of key,value

    private class hmNode{
        K key;
        V value;

        public hmNode(K key, V value) {
            this.key = key;
            this.value=value;
        }
    }

    private int size;
    private LinkedList<hmNode>[] buckets;  // in linkedList data is in key,value pair form

    public _0HashMap(){
        this.size=0;
        initbuckets(4);

    }
    public void initbuckets(int N){
        buckets = new LinkedList[N];
        for(int bi=0;bi< buckets.length;bi++){
            buckets[bi]=new LinkedList<>();
        }
    }

    public  void put(K key,V value){
        int bi = hashFunction(key);
       int di = getIndexWithinBucket(key,bi);

        if(di!=-1){ // update if key already present
            buckets[bi].get(di).value=value;
        }
        else{  // insert a new entry with key value
            hmNode newNode = new hmNode(key,value);
            buckets[bi].add(newNode);
            size++;
        }

        // resize if (lambda ) crosses the threshold (lambda<=k)

        double lambda = size*1.0 / buckets.length;
        if(lambda>2){  // threshold value = 2
            rehash();
        }

    }
    public void rehash(){
        LinkedList<hmNode>[] oba = buckets;
        initbuckets(2*oba.length);
        for(LinkedList<hmNode> bucket:oba){
            for(hmNode node : bucket){
                put(node.key, node.value);
            }
        }

        // in new bucketArray previous nodes may  go in same or different bucket
    }

    public  int hashFunction(K key){

        int hc = key.hashCode();
        return Math.abs(hc)% buckets.length;
    }
    public int getIndexWithinBucket(K key,int bi){
        int di=0;

        for(hmNode node : buckets[bi]){
            if(node.key.equals(key)){
                return di;
            }
            di++;
        }
        return -1;
    }
    public boolean containsKey(K key){
        int bi = hashFunction(key);
        int di = getIndexWithinBucket(key,bi);
        if(di!=-1){
            return true;
        }
        else{
            return false;
        }
    }
    public V get(K key){
        int bi = hashFunction(key);
        int di = getIndexWithinBucket(key,bi);
        if(di!=-1){
           return buckets[bi].get(di).value;
        }
        else{
            return null;
        }
    }

    public V remove (K key){
        int bi = hashFunction(key);
        int di = getIndexWithinBucket(key,bi);
        if(di!=-1){
            hmNode node =buckets[bi].remove(di);
            size--;
            return node.value;

        }
        else{
            return null;
        }

    }

    public int getSize(){
        return this.size;
    }

    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for(LinkedList<hmNode> bucket :buckets){
            for(hmNode node : bucket){
                keys.add(node.key);
            }
        }
        return keys;
    }

    public static void main(String[] args) {
        _0HashMap map1 = new _0HashMap();
        map1.put(5,1);
        map1.put(5,2);
        System.out.println(map1.getSize());
        System.out.println(map1.get(2));

        // In worst case time complexity can go upto O(N) when all eleemnts will insert in a single bucket
        // but it gurrantees O(logN) inaverage case 
    }
}


