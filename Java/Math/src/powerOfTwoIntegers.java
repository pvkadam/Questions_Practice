/*
 * Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True  
as 2^2 = 4. 
 */
public class powerOfTwoIntegers {
    public boolean isPower(int a) {
        if (a <= 1) return true;
    
   for (int base = 2; base < a && base < Integer.MAX_VALUE / base; base++) {
       int temp = base; 
       while (temp <= a && temp < Integer.MAX_VALUE / base) {
           temp *= base;
           if (temp == a) return true;
       }
   }
    
   return false;
   }
}
