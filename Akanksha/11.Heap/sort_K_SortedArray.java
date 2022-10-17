import java.util.*;
import java.io.*;
 class sort_K_SortedArray{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[]arr = new int[n];
    for(int i =0 ;i<n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());
    int i = 0;
    int j = k+1;
    PriorityQueue<Integer>pq = new PriorityQueue<>();
    while(i<arr.length){
      pq.add(arr[i]);
      j--;
      if(j==0){
        while(pq.size()>0){
          System.out.println(pq.peek());
          pq.remove();
        }
        j = k+1;
      }
      i++;
    }
    while(pq.size()>0){
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}
