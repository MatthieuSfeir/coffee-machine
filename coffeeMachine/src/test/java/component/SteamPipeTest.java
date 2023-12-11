package component;

import fr.imt.coffee_machine.component.SteamPipe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SteamPipeTest {

    @Test
    public void testInitialState() {
        // Arrange
        SteamPipe steamPipe = new SteamPipe();

        // Assert
        assertFalse(steamPipe.isOn(), "La buse de vapeur devrait être initialement éteinte ");
    }

    @Test
    public void testSetOn() {
        // Arrange
        SteamPipe steamPipe = new SteamPipe();

        // Act
        steamPipe.setOn();

        // Assert
        assertTrue(steamPipe.isOn(), "La buse de vapeur devrait être allumée");
    }

    @Test
    public void testSetOff() {
        // Arrange
        SteamPipe steamPipe = new SteamPipe();

        // Act
        steamPipe.setOff();

        // Assert
        assertFalse(steamPipe.isOn(), "La buse de vapeur devrait être éteinte");
    }
}
