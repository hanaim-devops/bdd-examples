package lottomachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlazenBolTest {
    @Test
    public void wannneerDeGlazenBolSlechtsEenBalHeeftPakJeAltijdDezelfde() {
        //Assert
        GlazenBol bol = new GlazenBol(1);
        //Act
        Lottobal lottobal = bol.schepBal();
        //Arrange
        assertEquals(1, lottobal.getNummer());
    }
}
