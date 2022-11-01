package ru.netology.sqr.homework.packages.and.cycles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.homework.packages.and.cycles.SQRService;


public class SQRServiceTest {

@ParameterizedTest
@CsvFileSource(files = "src/test/resources/data.csv")

    public void shouldCalculateNumberOfRoots (int expected, int min, int max) {
    SQRService service = new SQRService();
    int actual = service.sqrCalc(min, max);

    Assertions.assertEquals(expected, actual);

}







}


