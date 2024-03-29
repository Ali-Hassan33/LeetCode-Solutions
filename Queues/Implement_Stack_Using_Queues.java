public class MyStack<T> {

    private Queue<T> q1 = new LinkedList<>();
    private Queue<T> q2 = new LinkedList<>();
    private T top;


    public void push(T x) {
        q1.add(x);
        top = x;
    }

    public void pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        q1.remove();
        // swapping to avoid copying process
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public Boolean empty() {
            return q1.isEmpty();
    }
    public T top(){
        return top;
    }

    }

