public class Dessert {
    public int flavor;
    public int price;
    public Dessert(int flavor,int price){
        this.flavor = flavor;
        this.price = price;
        numDesserts += 1;
    }
    static public int numDesserts;
    public void printDessert(){
        System.out.printf("%d %d %d\n",this.flavor,this.price,numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }

}
