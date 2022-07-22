public class Main {
    public static void main(String[] args) {

//        Shoe marell = new Walking ("Marell",41.5,true);
//        Shoe adidas = new Walking("Adidas",42.0,false);
//        Shoe puma = new Running("Puma", 250.0,42.0);

        Shoe []arr = {new Walking ("Merell",41.5,true),
                new Walking("Adidas",42.0,false),
                new Running("Puma", 40.5,420.0)};

        System.out.println("Brand\t"+"Size\t"+"Spesification\t");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}