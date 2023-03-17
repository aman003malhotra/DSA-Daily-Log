package CodingNinja.Graphs;
import java.util.*;

public class DisjointSet {
    ArrayList<Integer> rank = new ArrayList<Integer>();
    ArrayList<Integer> parent = new ArrayList<Integer>();

    public DisjointSet(int n){
        for(int i=0;i<n;i++){
            rank.add(0);
            parent.add(i);
        }
    }

    public int findParent(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ultimateParent = findParent(parent.get(node));
        parent.set(node, ultimateParent);
        return parent.get(node);
    }


    public void unionByRank(int u, int v){
        int ulp_v = findParent(v);
        int ulp_u = findParent(u);

        if(ulp_v == ulp_u){
            return;
        }

        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
        }else if(rank.get(ulp_u) > rank.get(ulp_v)){
            parent.set(ulp_v, ulp_u);
        }else{
            parent.set(ulp_v, ulp_v);
            rank.set(ulp_u, rank.get(ulp_u)+1);
        }
    }
}
