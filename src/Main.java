//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 150; // начальный счет
        int b = 1200; // сумма пополнения для бонуса
        int c = 100; // за каждые 100р бонус 1р.
        if (b > 1000) {
            System.out.println(b);
            System.out.println((b / c ) +  " Бонус за пополнение");
            System.out.println((b + a ) + " Всего на счету");
        }else {
            System.out.println((b + a) + " Всего на счету" );
        }


    }
}