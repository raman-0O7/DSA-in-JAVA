import java.util.Stack;
import java.util.EmptyStackException;

public class QueueWithStackImplementation {
    static Stack<Integer> s1 = new Stack<>();
    static  Stack<Integer> s2 = new Stack<>();

    static void enqueue(int data){
        s1.push(data);
    }

    static int dequeue(){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int data  = s2.pop();
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        return data;
    }
    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        System.out.println(dequeue());
        enqueue(5);
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
        try{
            System.out.println(dequeue());

        }
        catch (EmptyStackException e ){
            System.out.println("Stack is empty!! : "+e );
        }
    }
}
