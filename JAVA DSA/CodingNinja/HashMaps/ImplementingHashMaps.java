package CodingNinja.HashMaps;
import java.util.*;



public class ImplementingHashMaps<K,V> {
    ArrayList<MapNode<K,V>> buckets;
    int count;
    int numBuckets;

    public void Map() {
        buckets = new ArrayList<>();
        numBuckets = 20;
        for(int i=0;i<numBuckets;i++){
            buckets.add(null);
        }
    }

    public int getBucketIndex(K key){
        int hc = key.hashCode();
        int index = hc%numBuckets;

        return index;
    }

    private void reHash(){
    ArrayList<MapNode<K,V>> temp = buckets;
    buckets = new ArrayList<MapNode<K,V>>();
    for(int i = 0; i < 2*numBuckets; i++){
        buckets.add(null);
    }
    count = 0;
    numBuckets = numBuckets*2;
    for(int i = 0; i<temp.size(); i++){
        MapNode<K,V> head = temp.get(i);
        while(head !=null){
            K key = head.key;
            insert(key, head.value);
            head = head.next;
        }
    }

    }

    public int size(){
        return count;
    }

    public void insert(K key, V value){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){ // == is not correct as it will check address
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        MapNode<K,V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode); 
        count++;
        double loadFactor = 1.0 * count/ numBuckets;
        if(loadFactor > 0.7){
            reHash();
        }
    }

    public V getValue(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){ // == is not correct as it will check address
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V removeKey(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev = null;
        while(head != null){
            if(head.key.equals(key)){ // == is not correct as it will check address
                if(prev == null){
                    buckets.set(bucketIndex, head.next);
                }else{
                    prev.next = head.next;
                }
                count--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;  
    }
}

