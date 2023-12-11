package component;

import fr.imt.coffee_machine.component.BeanTank;
import fr.imt.coffee_machine.component.CoffeeGrinder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CoffeeGrinderTest {

    @Test
    public void testGrindCoffee() throws InterruptedException {
        // Arrange
        BeanTank mockBeanTank = Mockito.mock(BeanTank.class);
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder(100);

        // Act
        double grindingTime = coffeeGrinder.grindCoffee(mockBeanTank);

        // Assert
        assertEquals(100, grindingTime, "Le temps de broyage devrait être égal au temps spécifié dans le constructeur");
            }
}
