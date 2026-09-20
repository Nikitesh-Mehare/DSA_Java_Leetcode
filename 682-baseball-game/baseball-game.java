class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations)
        {
            if(op.equals("C"))
            {
                stack.pop();
            }
            else if(op.equals("D"))
            {
                stack.push(stack.peek()*2);
            }
            else if(op.equals("+"))
            {
                int last = stack.peek();
                int secondLast = stack.get(stack.size()-2);
                stack.push(last + secondLast);
            }
            else
            {
                stack.push(Integer.parseInt(op));
            }
        }
        int total = 0;
        while(!stack.isEmpty())
        {
            total += stack.pop();
        }
        return total;
    }
}