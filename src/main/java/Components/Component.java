package Components;

public abstract class Component {

    private double cost;
    private double repairCost;

    public Component(double cost, double repairCost) {
        this.cost = cost;
        this.repairCost = repairCost;
    }

    public double getCost() {
        return cost;
    }

    public double getRepairCost() {
        return repairCost;
    }
}
