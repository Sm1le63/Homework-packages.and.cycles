package ru.netology.sqr.homework.packages.and.cycles;
import ru.netology.sqr.homework.packages.and.cycles.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService ();
        System.out.println("В выбранном диапазоне корней " + service.sqrCalc(200, 300));



    }

}
