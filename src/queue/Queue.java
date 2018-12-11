package queue;

public interface Queue<T> {

    /**
     * appends new tail
     * @param object
     */
    void push(T object);

    /**
     * removes head
     */
    void pop();

    /**
     * checks if queue is empty
     * @return
     */
    boolean empty();

    /**
     * tells how many objects are in the queue
     * @return
     */
    int size();

    /**
     * get the head object
     * @return
     */
    Object getHead();

    /**
     * get the tail object
     * @return
     */
    Object getTail();
}
