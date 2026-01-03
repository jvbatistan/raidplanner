package br.com.jvbatistan.raidplanner.domain;

import br.com.jvbatistan.raidplanner.domain.enums.Faction;
import br.com.jvbatistan.raidplanner.domain.enums.FactionGroup;

import java.util.Arrays;
import java.util.List;

public final class Factions {
    private Factions() {}
    
    public static List<Faction> all() {
        return List.of(Faction.values());
    }

    public static List<Faction> byGroup(FactionGroup group) {
        return Arrays.stream(Faction.values())
                .filter(f -> f.getGroup() == group)
                .toList();
    }
}
