package CodingNinja.PriorityQueue;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = {2,3,2,2,4};
        System.out.println(buyTicket(arr, 3));
    }

    public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		Queue<Integer> qu = new LinkedList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for(int i = 0; i < input.length; i++){
			qu.add(i);
			pq.add(-1*input[i]);
		}

		int count = 0;

		while(!qu.isEmpty()){
			int ind = qu.poll();
			
			if(-1* pq.peek() == input[ind]){
				count++;
				if(ind == k){
					break;
				}
				pq.poll();
			}else{
				qu.add(ind);
			}
		}

		return count;
	}
}
