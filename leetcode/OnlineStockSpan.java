//  901. Online Stock Span

class OnlineStockSpan {

    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int value = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            value += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price, value});
        return value;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */