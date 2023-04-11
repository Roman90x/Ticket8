public class Speed {
    static void findSpeed(int a) throws MyException {
        System.out.println("Вычисление началось");
        if (a < 0)
            throw new MyException(a);
        System.out.println("Вычисление завершено успешно");
    }

    public static void main(String[] args) {
        try {
            findSpeed(10);
            findSpeed(20);
            findSpeed(-10);
        } catch (MyException e) {
            System.out.println("Выброшено мое исключение");
        }
    }
}
