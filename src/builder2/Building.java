package builder2;

public class Building {

    private int numberOfFloors;
    private BuildingType type;
    private double floorHeight;
    private boolean isGarage;

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public BuildingType getType() {
        return type;
    }

    public void setType(BuildingType type) {
        this.type = type;
    }

    public double getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(double floorHeight) {
        this.floorHeight = floorHeight;
    }

    public boolean isGarage() {
        return isGarage;
    }

    public void setGarage(boolean atelier) {
        isGarage = atelier;
    }

    @Override
    public String toString() {
        return
        "New Building: "
        +"\nBuilding type: " + this.getType()
        +"\nBuilding floors: " + this.getNumberOfFloors()
        +"\nFloor height: " + this.getFloorHeight()
        +"\nHas garage: " + this.isGarage();
    }
}
