//  155. Min Stack

class MinStack() {

    /** initialize your data structure here. */
    var stack = Stack<Int>()
    var min_stack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
        if(min_stack.isEmpty() || x <= min_stack.peek()) {
            min_stack.push(x)
        }

    }

    fun pop() {
        if(stack.peek() == min_stack.peek()) {
            min_stack.pop()
        }
        stack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return min_stack.peek()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */