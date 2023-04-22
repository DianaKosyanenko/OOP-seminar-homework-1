public class Milk extends Product{
    private final String flavor;


    public Milk(String name, Integer cost, String flavor) {
        super(name, cost);

        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() +" " + flavor;

    }
}


