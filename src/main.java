import java.util.List;
public class main {
    public static void main(String[] args) {
        Street LuisC = new Street();
        House LeoH = new House();
        LuisC.addHouse(5, LeoH);
        House MirnaH = LuisC.getHouse(0);
    }
}