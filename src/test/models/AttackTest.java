package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.verify;

class AttackTest {
    Attack attacks;
    Card card;
    MagicCard magicCard;
    CreatureCard opponent;
    MagicCard mockMagicCard= Mockito.mock(MagicCard.class);
    CreatureCard spyOpponentCard;
    @BeforeEach
    void setUp() {
        attacks=new Attack();
        opponent =new CreatureCard(5,7,"ACard","IGNITE",7,6,1);
        spyOpponentCard= Mockito.spy(opponent);
    }
    @DisplayName("Test ignite attack method")
    @Test
    void ignite() {
        assertThat(mockMagicCard, isA(MagicCard.class));
        verify(spyOpponentCard, atMost(2)).removeHp(2);
        int expected=5;
        spyOpponentCard.removeHp(2);
        int actual=spyOpponentCard.getHp();
        assertEquals(expected,actual);
    }

}