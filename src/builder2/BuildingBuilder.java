package builder2;

public abstract class BuildingBuilder {

    protected BuildingMode buildingMode;
    protected Building building;

    protected abstract void composeBuilding(Building building); //default building

    public Building build() {
        return building;
    }
}
