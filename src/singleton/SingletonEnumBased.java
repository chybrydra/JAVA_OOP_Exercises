package singleton;

public enum SingletonEnumBased {

    INSTANCE;

    private int count;

    public void addOne() {
        count++;
    }

    public int getCount() {
        return count;
    }
}