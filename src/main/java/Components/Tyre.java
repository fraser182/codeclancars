package Components;

public class Tyre extends Component {

    String make;

    public Tyre(double cost, double repairCost, String make) {
        super(cost, repairCost);
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
