class MyCircularQueue {
        int q[];
        int front = 0, rear = -1, size = 0, cap;
    public MyCircularQueue(int k) {
        q = new int[k];
        cap = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        rear = (rear + 1) % cap;
        q[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front + 1) % cap;
        size--;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 :q[front];
    }
    
    public int Rear() {
        return isEmpty() ? -1 :q[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */