class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Base score for the outer level

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0); // Entering a new nested level, start fresh with score 0
            } else {
                int innerScore = stack.pop(); // Score of the inner block
                int outerScore = stack.pop(); // Score of the outer/previous block at this level
                
                // If innerScore is 0, it means we had "()", which scores 1.
                // Otherwise, we had "(A)" which scores 2 * innerScore.
                int currentScore = outerScore + Math.max(2 * innerScore, 1);
                stack.push(currentScore);
            }
        }

        return stack.pop();
    }
}