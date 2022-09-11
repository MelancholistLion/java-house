import java.util.List;

public class Neighbourhood {
    private List<Street> streets;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    public void setStreet(List<Street> streets) {
        this.streets = streets;
    }
    public void setGardens(int gardens) {
        this.gardens = gardens;
    }
    public void setBasketballCourt(boolean basketballCourt) {
        this.basketballCourt = basketballCourt;
    }

    public void setFootballCourt() {
        this.footballCourt = footballCourt;
    }
    public void setSwimmingPool(boolean swimmingPool) {
        this.basketballCourt = basketballCourt;
    }

    public List<Street> getStreet() {
        return streets;
    }
    public int getGardens() {
        return gardens;
    }
    public boolean isBasketballCourt() {
        return basketballCourt;
    }
    public boolean isFootballCourt() {
        return footballCourt;
    }
    public boolean isSwimmingPool() {
        return swimmingPool;
    }

}
