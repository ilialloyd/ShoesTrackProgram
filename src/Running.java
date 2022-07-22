public class Running extends Shoe{
    public final double weight;

    Running(String brand, double size,double weight) {
        super(brand,size);
        this.weight = weight;
    }
    public String toString(){
        return brand+"\t"+size+"\t"+weight+"gr/weight";
    }
}
