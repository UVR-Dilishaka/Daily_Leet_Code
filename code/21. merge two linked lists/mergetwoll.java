public class mergetwoll {

  class ListNode {
      int val;
      ListNode next;
      
      // Default constructor
      public ListNode() {}
      
      // Constructor with a value
      public ListNode(int val) {
          this.val = val;
      }
      
      // Constructor with a value and next node
      public ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode dummy= new ListNode();
    ListNode current  = dummy;

    while ( list1 != null && list2 != null) {

      if (list1.val <= list2.val) {
        current.next =  list1;
        list1 = list1.next;
        
      }else{
        current.next = list2;
        list2 = list2.next;
      }

    
    }

    if (list1 == null) {

      current.next = list2;
      
    }else{
      current.next = list1;
    }

    return dummy.next;



    


  }









  public static void main(String[] args) {

    mergeTwoLists();
    
  }
  
}
