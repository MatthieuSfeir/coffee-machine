package component;

import fr.imt.coffee_machine.EspressoCoffeeMachine;
import fr.imt.coffee_machine.component.BeanTank;
import fr.imt.coffee_machine.component.SteamPipe;
import fr.imt.coffee_machine.exception.CannotMakeCremaWithSimpleCoffeeMachine;
import fr.imt.coffee_machine.exception.CoffeeTypeCupDifferentOfCoffeeTypeTankException;
import fr.imt.coffee_machine.exception.LackOfWaterInTankException;
import fr.imt.coffee_machine.exception.MachineNotPluggedException;
import fr.imt.coffee_storage.coffeetype.CoffeeType;
import fr.imt.coffee_storage.container.Cup;
import fr.imt.coffee_storage.container.Mug;
import fr.imt.coffee_storage.container.CoffeeContainer;
import fr.imt.coffee_storage.exception.CupNotEmptyException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EspressoCoffeeMachineTest {

    @Test
    void testMakeCoffeePlugged() {

        EspressoCoffeeMachine espressoCoffeeMachine = new EspressoCoffeeMachine(10,
                50, 5, 20, 2);

        espressoCoffeeMachine.plugToElectricalPlug();
        espressoCoffeeMachine.addWaterInTank(10);
        espressoCoffeeMachine.addCoffeeInBeanTank(0.2, CoffeeType.MOKA);

        CoffeeContainer result = null;

        try {
            result = espressoCoffeeMachine.makeACoffee(new Cup(0.2), CoffeeType.MOKA);

        } catch (CoffeeTypeCupDifferentOfCoffeeTypeTankException e) {
            throw new RuntimeException(e);
        } catch (LackOfWaterInTankException e) {
            throw new RuntimeException(e);
        } catch (CupNotEmptyException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (MachineNotPluggedException e) {
            throw new RuntimeException(e);
        }

    assertNotNull((result));
    assertFalse(result.isEmpty());
    assertEquals(15, espressoCoffeeMachine.getNbCoffeeMade());

    }
}
