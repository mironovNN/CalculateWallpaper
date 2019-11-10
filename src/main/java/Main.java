import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double RollWidth = 1.06;
        double RollLength = 10;
        double Adjust = 0.1;

        System.out.println("Введите ширину комнаты: ");
        double RommWidth = in.nextDouble();

        System.out.println("Введите длину комнаты: ");
        double RommLength = in.nextDouble();

        System.out.println("Введите высоту комнаты: ");
        double RommHeight = in.nextDouble();

        double NumberFullPanelsInRoll = Math.floor(RollLength / RommHeight + Adjust);
        double NumberFullPanels = Math.ceil(((RommWidth + RommLength) * 2) / RollWidth);

        System.out.println("Для поклейки комнаты необходимо " + Math.ceil(NumberFullPanels / NumberFullPanelsInRoll) + " руллонов обоев");
    }
}


