public class Main {
    public static void main(String[] args) {
        int initial = 300;
        int deposit = 2200;
        boolean more = deposit > 1000;
        int percent;
        if (more) {
            percent = deposit / 100;
        } else {
            percent = 0;
        }
        int i = initial + deposit + percent;

        {
            System.out.println("Итоговая сумма на счету клиента: " + i);
        }

    }
}
