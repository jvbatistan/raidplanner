package br.com.jvbatistan.raidplanner;

import br.com.jvbatistan.raidplanner.domain.Character;
import br.com.jvbatistan.raidplanner.domain.Factions;
import br.com.jvbatistan.raidplanner.domain.enums.*;

public class RaidPlannerApp {
    public static void main( String[] args ) {
        Character lamasu = new Character(
            "Lamasu",
            Affinity.VOID,
            Rarity.LEGENDARY,
            ChampionRole.SUPPORT,
            Faction.DEMONSPAWN,
            115
        );

        System.out.println(lamasu.getName()
                + " | " + lamasu.getAffinity()
                + " | " + lamasu.getRarity()
                + " | " + lamasu.getRole()
                + " | " + lamasu.getFaction().getLabel()
                + " (" + lamasu.getFactionGroup() + ")"
                + " | SPD " + lamasu.getBaseSpeed()
        );

        System.out.println("\nFacções do GAELLEN_PACT:");
        for (Faction f : Factions.byGroup(FactionGroup.GAELLEN_PACT)) {
            System.out.println("- " + f.getLabel());
        }
    }
}
