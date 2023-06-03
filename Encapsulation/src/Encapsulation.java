public class Encapsulation {
    private String name;
    private int weight;
    private int cost;

    public void setData(String x, int y, int z){
        name =x;
        weight = y;
        cost = z;
    }
    public String getName(){
        return name;
    }
    public int getMileage(){
        return weight;
    }
    public  int getCost(){
        return cost;
    }

}
class Demo{
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();

        e.setData("Azmycin", 650,15);
        System.out.println(e.getName());
        System.out.println(e.getMileage());
        System.out.println(e.getCost());
    }
}
