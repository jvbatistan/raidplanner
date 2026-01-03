package br.com.jvbatistan.raidplanner.domain.enums;

public enum Faction {
    BANNER_LORDS(FactionGroup.TELERIAN_LEAGUE, "Banner Lords"),
    HIGH_ELVES(FactionGroup.TELERIAN_LEAGUE, "High Elves"),
    SACRED_ORDER(FactionGroup.TELERIAN_LEAGUE, "Sacred Order"),
    BARBARIANS(FactionGroup.TELERIAN_LEAGUE, "Barbarians"),

    ORGRYN_TRIBLES(FactionGroup.GAELLEN_PACT, "Orgryn Tribes"),
    LIZARDMEN(FactionGroup.GAELLEN_PACT, "Lizardmen"),
    SKINWALKERS(FactionGroup.GAELLEN_PACT, "Skinwalkers"),
    ORCS(FactionGroup.GAELLEN_PACT, "Orcs"),

    DEMONSPAWN(FactionGroup.THE_CORRUPTED, "Demonspawn"),
    UNDEAD_HORDES(FactionGroup.THE_CORRUPTED, "Undead Hordes"),
    DARK_ELVES(FactionGroup.THE_CORRUPTED, "Dark Elves"),
    KNIGHTS_REVENANT(FactionGroup.THE_CORRUPTED, "Knights Revenant"),

    DWARVES(FactionGroup.NYRESAN_UNION, "Dwarves"),
    SHADOWKIN(FactionGroup.NYRESAN_UNION, "Shadowkin"),
    SYLVAN_WATCHERS(FactionGroup.NYRESAN_UNION, "Sylvan Watchers");

    private final FactionGroup group;
    private final String label;

    Faction(FactionGroup group, String label) {
        this.group = group;
        this.label = label;
    }

    public FactionGroup getGroup() {
        return group;
    }

    public String getLabel() {
        return label;
    }
}
