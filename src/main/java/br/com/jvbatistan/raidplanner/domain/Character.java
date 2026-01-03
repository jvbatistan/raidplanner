package br.com.jvbatistan.raidplanner.domain;

import br.com.jvbatistan.raidplanner.domain.enums.Affinity;
import br.com.jvbatistan.raidplanner.domain.enums.ChampionRole;
import br.com.jvbatistan.raidplanner.domain.enums.Faction;
import br.com.jvbatistan.raidplanner.domain.enums.FactionGroup;
import br.com.jvbatistan.raidplanner.domain.enums.Rarity;

public class Character {

    private final String name;
    private final Affinity affinity;
    private final Rarity rarity;
    private final ChampionRole role;
    private final Faction faction;
    private final int baseSpeed;
    
    public Character(String name, Affinity affinity, Rarity rarity, ChampionRole role, Faction faction, int baseSpeed) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name is required");
        if (affinity == null) throw new IllegalArgumentException("affinity is required");
        if (rarity == null) throw new IllegalArgumentException("rarity is required");
        if (role == null) throw new IllegalArgumentException("role is required");
        if (faction == null) throw new IllegalArgumentException("faction is required");
        if (baseSpeed <= 0) throw new IllegalArgumentException("baseSpeed must be > 0");

        this.name = name;
        this.affinity = affinity;
        this.rarity = rarity;
        this.role = role;
        this.faction = faction;
        this.baseSpeed = baseSpeed;
    }

    public String getName() { return name; }
    public Affinity getAffinity() { return affinity; }
    public Rarity getRarity() { return rarity; }
    public ChampionRole getRole() { return role; }
    public Faction getFaction() { return faction; }
    public int getBaseSpeed() { return baseSpeed; }

    public FactionGroup getFactionGroup() {
        return faction.getGroup();
    }
}
