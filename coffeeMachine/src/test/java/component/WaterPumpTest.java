package component;

import fr.imt.coffee_machine.component.WaterPump;
import fr.imt.coffee_machine.component.WaterTank;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WaterPumpTest {

    @Test
    public void testPumpWater() throws InterruptedException {
        // Arrange
        WaterPump waterPump = new WaterPump(2.5);
        WaterTank mockWaterTank = Mockito.mock(WaterTank.class);

        // Mocking Logger
        WaterPump.logger = Mockito.mock(Logger.class);

        // Act
        double pumpingTime = waterPump.pumpWater(1.5, mockWaterTank);

        // Assert
        assertTrue(pumpingTime > 0, "Le temps de pompage devrait être supérieur à zéro");

    }
}
