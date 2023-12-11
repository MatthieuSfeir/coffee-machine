package component;

import fr.imt.coffee_machine.component.Tank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TankTest {

    @Test
    public void testInitialVolume() {
        // Arrange
        double initialVolume = 30;
        double minVolume = 10;
        double maxVolume = 100;

        // Act
        Tank tank = new Tank(initialVolume, minVolume, maxVolume);

        // Assert
        assertEquals(initialVolume, tank.getActualVolume(), "Le volume initial du réservoir doit être correct");
    }

    @Test
    public void testIncreaseVolume() {
        // Arrange
        Tank tank = new Tank(30, 10, 100);

        // Act
        tank.increaseVolumeInTank(70);

        // Assert
        assertEquals(100, tank.getActualVolume(), "Le volume du réservoir devrait être augmenté à 80");
    }

    @Test
    public void testDecreaseVolume() {
        // Arrange
        Tank tank = new Tank(30, 10, 100);

        // Act
        tank.decreaseVolumeInTank(20);

        // Assert
        assertEquals(10, tank.getActualVolume(), "Le volume du réservoir devrait être réduit à 30");
    }

    @Test
    public void testMinMaxVolume() {
        // Arrange
        double initialVolume = 30;
        double minVolume = 10;
        double maxVolume = 100;

        // Act
        Tank tank = new Tank(initialVolume, minVolume, maxVolume);

        // Assert
        assertEquals(minVolume, tank.getMinVolume(), "Le volume minimal du réservoir devrait être correct");
        assertEquals(maxVolume, tank.getMaxVolume(), "Le volume maximal du réservoir devrait être correct");
    }
}
