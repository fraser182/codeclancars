package Components;

public class Engine extends Component {

    String type;

    public Engine(double cost, double repairCost, String type) {
        super(cost, repairCost);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
