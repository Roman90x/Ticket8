public class MyException extends Exception {

    private int speed;

    MyException(int a) {
        speed = a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "speed=" + speed +
                '}';
    }
}
