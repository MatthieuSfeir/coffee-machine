package component;

import fr.imt.coffee_machine.component.BeanTank;
import fr.imt.coffee_storage.coffeetype.CoffeeType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BeanTankTest {

    @Test
    public void testIncreaseCoffeeVolumeInTank() {
        // Arrange
        BeanTank beanTank = new BeanTank(50, 10, 100, CoffeeType.ARABICA);

        // Act
        beanTank.increaseCoffeeVolumeInTank(30, CoffeeType.ROBUSTA);

        // Assert
        assertEquals(80, beanTank.getActualVolume(), "Le volume du réservoir devrait être augmenté à 80");
        assertEquals(CoffeeType.ROBUSTA, beanTank.getBeanCoffeeType(), "Le type de café dans le réservoir devrait être Robusta");
    }
}

