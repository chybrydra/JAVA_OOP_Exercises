package queue;

public class QueueImpl<T> implements Queue<T> {

    int capacity; //how many objects CAN be inside the queue
    int objectsInside; //how many objects ARE inside the queue
    Object[] queue;

    public QueueImpl(int capacity) {
        this.capacity = capacity;
        this.objectsInside = 0;
        queue = new Object[capacity];
    }

    @Override
    public void push(T object) {
        if (objectsInside<capacity){
            queue[objectsInside] = object;
            objectsInside++;
        } else {
            System.out.println("The queue is already full! Cannot add anything!");
        }
    }

    @Override
    public void pop() {
        if (objectsInside>0){
            for (int i=0; i<objectsInside-1; i++){
                queue[i]=queue[i+1];
            }
            queue[objectsInside-1] = null;
            objectsInside--;
        } else {
            System.out.println("The queue is already empty! Cannot remove anything!");
        }
    }

    @Override
    public boolean empty() {
        if (objectsInside==0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return objectsInside;
    }

    @Override
    public Object getHead() {
        if (objectsInside>0) {
            return queue[0];
        } else {
            return null;
        }
    }

    @Override
    public Object getTail() {
        if (objectsInside>0) {
            return queue[objectsInside-1];
        } else {
            return null;
        }
    }
}
