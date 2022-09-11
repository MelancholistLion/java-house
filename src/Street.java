import java.util.ArrayList;
import java.util.List;

public class Street {
    private String name;
    private List<House> houses = new ArrayList<House>();

    public void setName(String name) {
        this.name = name;
    }
    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
    public void addHouse(int number, House house) {
        if(houses.isEmpty() && houses.size() <= number) {
            houses.add(house);
        } else {
            House indexHouse = houses.get(number);
            houses.add(number, house);
            houses.add(indexHouse);
        }
    }

    public String getName() {
        return name;
    }
    public List<House> getHouses() {
        return houses;
    }
    public House getHouse(int number) {
        return houses.get(number);
    }
}