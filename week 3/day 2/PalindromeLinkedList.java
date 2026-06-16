class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> List = new ArrayList<>();
        while (head != null) {
            List.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = List.size() - 1;
        while(left<right) {
            if(!List.get(left).equals(List.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
