package br.com.jvbatistan.raidplanner;

import br.com.jvbatistan.raidplanner.domain.Stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsTest {

    @Test
    public void creates_valid_stats() {
        Stats stats = new Stats(20805, 936, 1255, 115, 15, 50, 30, 20, 0);

        assertEquals(20805, stats.getHp());
        assertEquals(936, stats.getAtk());
    }

    @Test
    public void rejects_invalid_crit_rate() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Stats(20805, 936, 1255, 115, 150, 50, 30, 20, 0)
        );

        assertTrue(ex.getMessage().toLowerCase().contains("critrate"));
    }
}
