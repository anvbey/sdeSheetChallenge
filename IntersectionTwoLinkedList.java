/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int len1=0,len2=0;
        ListNode temp2= headB;
        ListNode temp1= headA;
        if(temp1 == null || temp2 == null)
            return null;
        while( temp2 !=null)
        {
            len2++;
            temp2= temp2.next;
        }
        while( temp1 !=null)
        {
            len1++;
            temp1= temp1.next;
        }
        temp1 = headA;
        temp2 = headB;
        if(len1 > len2)
        {
            int diff=len1 - len2;
            for(int i=0;i<diff;i++)
            {
                temp1=temp1.next;
            }
        }
        else
        {
            
            int diff=len2 - len1;
            for(int i=0;i<diff;i++)
            {
                temp2=temp2.next;
            }
        }
        while(temp1 != null && temp2 != null)
        {
            if(temp1 == temp2)
                return temp1;
            temp1= temp1.next;
            temp2= temp2.next;
        }
        return null;
        
    }
}
