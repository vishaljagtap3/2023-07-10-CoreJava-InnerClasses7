public class Main {
    public static void main(String[] args) {

        //way 1
        Circle c1 = new Circle();
        c1.draw();
        c1.area();

        //way 2
        class CircleNew extends Shape {
            @Override
            public void draw() {
                System.out.println("CircleNew");
            }

            public float area() {
                return 0;
            }
        }

        CircleNew cn1 = new CircleNew();
        cn1.draw();
        cn1.area();

        Shape s1 = new CircleNew();
        s1.draw();
        ((CircleNew)s1).area(); //down-casting , be careful

        //way 3
        Shape s = new Shape() {
            @Override
            public void draw() {
                System.out.println("New Shape");
            }

            public float area() {
                return 0;
            }
        };

        s.draw();
        //s.area();
        //( (DerivedTypeName)s).area();

        //way 1
        Animal a = new Animal();
        a.move(100, 100);

        //Way 2
        class AnimalNew implements Movable {
            @Override
            public void move(int x, int y) {
                System.out.println("AnimalNew Move: " + x + " " + y);
            }

            public void info() {

            }
        }
        AnimalNew animalNew = new AnimalNew();
        animalNew.move(200, 200);
        animalNew.info();

        Movable m = new Movable() {
            @Override
            public void move(int x, int y) {
                System.out.println("Movable: " + x + " " + y);
            }
        };
        m.move(300, 300);

    }
}
