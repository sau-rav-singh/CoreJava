package RandomPractice;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
            if(pq.size()>3)
                pq.poll();
        }
        System.out.println(pq.peek());
    }
}
