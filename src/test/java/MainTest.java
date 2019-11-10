import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        Scanner in = new Scanner(System.in);

        double RollWidth = 1.06;
        double RollLength = 10;
        double Adjust = 0.1;

        System.out.println("Введите ширину комнаты: ");
        double RommWidth = 5;

        System.out.println("Введите длину комнаты: ");
        double RommLength = 6;

        System.out.println("Введите высоту комнаты: ");
        double RommHeight = 2.75;

        double NumberFullPanelsInRoll = Math.floor(RollLength / RommHeight + Adjust);
        double NumberFullPanels = Math.ceil(((RommWidth + RommLength) * 2) / RollWidth);

        System.out.println("Для поклейки комнаты необходимо " + Math.ceil(NumberFullPanels / NumberFullPanelsInRoll) + " руллонов обоев");

    }
}