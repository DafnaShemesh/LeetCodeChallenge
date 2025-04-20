import java.util.Arrays;
import java.util.Stack;

public class asteroidCollision {
        public static void moreCollision (int[] astro, int i, Stack<Integer> ans){
                    if (!ans.isEmpty() ){
                        int peek = ans.peek(); 
                    while (!ans.isEmpty()&&peek<0){
                        
                        int val = Math.abs(astro[i]) - Math.abs(peek);
                           if (val>0) { // i is bigger 
                        ans.pop(); 
                         }
                     else{
                            ans.pop();
                            return;
                         }
                         peek = ans.peek();
                    }
                    }
                           ans.push(astro[i]);
                    }
                public static int[] astrocoll(int[] asteroids) {
                            Stack<Integer> ans = new Stack<>();
                            int i = asteroids.length -1 ; 
                            ans.push(asteroids[i]);
                            i--; 
                           while (i>-1){
                            if (!ans.isEmpty()){
                            int peek = ans.peek(); 
                            if (peek<0 && asteroids[i]>0){
                                //there is collsion 
                                 int val = Math.abs(asteroids[i]) - Math.abs(peek);
                                 if (val>0) { // i is bigger 
                                ans.pop(); 
                                moreCollision(asteroids, i, ans); 
                         }
                        if (val==0){
                            ans.pop();
                         }
                    }
                    else {
                        ans.push(asteroids[i]);
                    }
                    }
                    else {
                       ans.push(asteroids[i]);
                    }
                    i--; 
                   }
                   int [] ansArr = new int[ans.size()]; 
                   int j=0; 
                   while (! ans.isEmpty()) { 
                    ansArr[j] = ans.pop(); 
                    j++; 
                   }
                   return ansArr; 
            }
            
        public static void main(String[] args) {
            int[] asto = new int[] {2,-1,-1,1}; 
            System.out.println(Arrays.toString(astrocoll(asto)));
}
    
}
