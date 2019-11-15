import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceTest {

    @Test
    void lengthRoomNull(){

        CalculateService service = new CalculateService();

        int result = service.calculateService(0,6,3.2);

        assertEquals(0, result);
    }
    @Test
    void wightRoomNull(){

        CalculateService service = new CalculateService();

        int result = service.calculateService(5,0,3.2);

        assertEquals(0, result);
    }
    @Test
    void heightRoomNull(){

        CalculateService service = new CalculateService();

        int result = service.calculateService(5,6,0);

        assertEquals(0, result);
    }
    @Test
    void calculate(){

        CalculateService service = new CalculateService();

        int result = service.calculateService(5,6,3.3);

        assertEquals(10, result);
    }
}