import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.empty() && st.peek()<=nums2[i]){
            st.pop();
            }
            if(st.empty())
            map.put(nums2[i],-1);
            else
            map.put(nums2[i],st.peek());
            st.push(nums2[i]); 
        } 
            for(int j=0;j<nums1.length;j++){
                nge[j]=map.get(nums1[j]);
            } 
            
                   
                   return nge;
       
    }
}
