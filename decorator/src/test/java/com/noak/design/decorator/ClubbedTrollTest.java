package com.noak.design.decorator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author yeww
 * @since 2018-07-04
 */
public class ClubbedTrollTest {

    @Test
    public void testClubbedTroll() {
        SimpleTroll simpleTroll = spy(new SimpleTroll());

        ClubbedTroll clubbedTroll = new ClubbedTroll(simpleTroll);
        assertEquals(20,clubbedTroll.getAttackPower());

        clubbedTroll.attack();
        verify(simpleTroll,times(1)).attack();

        clubbedTroll.fleeBattle();
        verify(simpleTroll,times(1)).fleeBattle();
    }

}