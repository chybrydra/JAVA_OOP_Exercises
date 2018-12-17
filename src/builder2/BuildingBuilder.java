package builder2;

public abstract class BuildingBuilder {


    protected Building building;

    protected abstract void composeBuilding();

    public Building build() {
        return building;
    }


}
