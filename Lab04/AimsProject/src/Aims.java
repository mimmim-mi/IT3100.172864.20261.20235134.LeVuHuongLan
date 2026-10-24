
public class Aims {
    public static void main(String[] args) {

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars", "Science Fiction",
                "George Lucas", 124, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladin", "Animation",
                "Ron Clements", 90, 18.99f);

        Cart cart = new Cart();

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("\n--- Cart before removal ---");
        cart.printCart();

        cart.removeDigitalVideoDisc(dvd2);

        System.out.println("\n--- Cart after removal ---");
        cart.printCart();

        Cart twoDvdCart = new Cart();
        twoDvdCart.addDigitalVideoDisc(dvd1, dvd2);

        System.out.println("\n--- Test adding two DVDs ---");
        twoDvdCart.printCart();

        Cart arrayCart = new Cart();
        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};

        arrayCart.addDigitalVideoDisc(dvdList);

        System.out.println("\n--- Test adding DVD array ---");
        arrayCart.printCart();

        Cart varargsCart = new Cart();
        varargsCart.addDigitalVideoDiscs(dvd1, dvd2, dvd3);

        System.out.println("\n--- Test adding DVDs using varargs ---");
        varargsCart.printCart();
    }
}
