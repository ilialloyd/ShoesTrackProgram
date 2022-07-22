public class Walking extends Shoe{
    public final boolean goreTex;

   /* The constructor shall also take the parameters
    necessary to call the constructor of the superclass.
    String brand and double also super() belong to Super class
    */
     Walking(String brand, double size,boolean goreTex) {
         super(brand,size);
         this.goreTex = goreTex;

    }


// giving value to boolean variable
    public String toString(){
        return brand+"\t"+size+"\t"+(goreTex? "Gore-tex":"No Gore-Tex");
    }
}
