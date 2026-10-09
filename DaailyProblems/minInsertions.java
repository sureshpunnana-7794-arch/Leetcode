class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int needed_right = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                needed_right += 2;
                if (needed_right % 2 == 1) {
                    insertions++;      
                    needed_right--;   
                }
            } else { // ch == ')'
                needed_right--;

                if (needed_right == -1) {
                    insertions++;      
                    needed_right += 2; 
                }
            }
        }

        return insertions + needed_right;
    }
}