public class Animal implements Movable{
    @Override
    public void move(int x, int y) {
        System.out.println("Moved to: " + x + " " + y);
    }
}
