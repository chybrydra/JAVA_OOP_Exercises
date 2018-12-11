//interfejs stosu (stack)

public interface Stack<T> {

    /**
     * add an object to a stack (on top of it)
     * @param object
     */
    void add(T object);

    /**
     * remove the last value
     */
    void remove();

    /**
     * get the last value
     */
    Object get();

    /**
     * get a size of the stack
     */
    int size();
}
