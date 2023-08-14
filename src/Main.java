public class Main {
    public static void main(String[] args) {

        //way 1
        Circle c1 = new Circle();
        c1.draw();

        //way 2
        class CircleNew extends Shape {
            @Override
            public void draw() {
                System.out.println("CircleNew");
            }
        }

        CircleNew cn1 = new CircleNew();
        cn1.draw();

        //way 3
        Shape s = new Shape() {
            @Override
            public void draw() {
                System.out.println("New Shape");
            }
        };
        s.draw();

        //way 1
        Animal a = new Animal();
        a.move(100, 100);

        //Way 2
        class AnimalNew implements Movable {
            @Override
            public void move(int x, int y) {
                System.out.println("AnimalNew Move: " + x + " " + y);
            }
        }
        AnimalNew animalNew = new AnimalNew();
        animalNew.move(200, 200);

        Movable m = new Movable() {
            @Override
            public void move(int x, int y) {
                System.out.println("Movable: " + x + " " + y);
            }
        };
        m.move(300, 300);

    }
}
