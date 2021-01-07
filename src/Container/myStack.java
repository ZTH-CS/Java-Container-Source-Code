package Container;

import java.util.EmptyStackException;
import java.util.Vector;

// 继承于Vector类，底层基于Vector实现
public class myStack<E> extends Vector<E> {

    private static final long serialVersionUID = 1224463164541339165L;

    public myStack() {
    }

    public E push(E item) {
        this.addElement(item);
        return item;
    }

    public synchronized E pop() {
        int len = this.size();
        E obj = this.peek();
        this.removeElementAt(len - 1);
        return obj;
    }

    public synchronized E peek() {
        int len = this.size();
        if (len == 0) {
            throw new EmptyStackException();
        } else {
            return this.elementAt(len - 1);
        }
    }

    public boolean empty() {
        return this.size() == 0;
    }

    //
    public synchronized int search(Object o) {
        int i = this.lastIndexOf(o);
        return i >= 0 ? this.size() - i : -1;
    }

}
