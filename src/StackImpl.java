public class StackImpl<T> implements Stack<T> {

    private int containerCapacity;
    private Object[] container;
    private byte elementsInside;

    public StackImpl(int containerCapacity) {
        this.containerCapacity = containerCapacity;
        container = new Object[containerCapacity];
        elementsInside = 0;
    }

    @Override
    public void add(T object) {
        if (elementsInside >= containerCapacity){
            System.out.println("The stack is full! You cannot store more objects inside!");
        } else {
            container[elementsInside] = object;
            elementsInside++;
        }
    }

    @Override
    public void remove() {
        if (elementsInside <= 0) {
            System.out.println("Nothing to remove! Stack already empty!");
        }else{
            container[elementsInside - 1] = null;
            elementsInside--;
        }

    }

    @Override
    public Object get() {
        if (elementsInside==0){
            return null;
        } else {
            return container[elementsInside-1];
        }
    }

    @Override
    public int size() {
        return elementsInside;
    }
}
