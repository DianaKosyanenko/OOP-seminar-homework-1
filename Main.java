public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("cheese", 300))
                .addProduct(new Product("water", 10))
                .addProduct(new Product("Wine", 330))
                .addProduct(new Yogurt("Danone", 300, "sweet"))
                .addProduct(new Chocolate("Milka", 299, "sweet"))
                .addProduct(new Milk("Pestravka", 150, "sweet-salty"));


        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));


        }
        Product found = vendingMachine.findProduct("water");
        System.out.println(found);
        System.out.println("Find product");
        Product sold = vendingMachine.sellProduct(found);
        System.out.println("summa in machine");
        System.out.println(vendingMachine.getAmount());
        System.out.println("-------------------------");

        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Find product");
        Product chocolate = vendingMachine.sellProduct(vendingMachine.findProduct("Milka"));
        System.out.println(chocolate);
        System.out.println("products");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));

        }
        System.out.println("summa in machine");
        System.out.println(vendingMachine.getAmount());
        System.out.println("-----------");

        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Find product");
        Product milk = vendingMachine.sellProduct(vendingMachine.findProduct("Pestravka"));
        System.out.println(milk);
        System.out.println("products");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));

        }
        System.out.println("summa in machine");
        System.out.println(vendingMachine.getAmount());


        try {
            Product mil = vendingMachine.sellProduct(vendingMachine.findProduct("Milk"));
            System.out.println(milk);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }
}
