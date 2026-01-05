package br.com.jvbatistan.raidplanner.domain;

public class Stats {
    private final int hp;
    private final int atk;
    private final int def;
    private final int spd;

    private final int critRate;
    private final int critDmg;
    private final int res;
    private final int acc;

    private final int ignoreDef;

    public Stats(int hp, int atk, int def, int spd, int critRate, int critDmg, int res, int acc, int ignoreDef) {
        if (hp <= 0) throw new IllegalArgumentException("hp must be > 0");
        if (atk <= 0) throw new IllegalArgumentException("atk must be > 0");
        if (def <= 0) throw new IllegalArgumentException("def must be > 0");
        if (spd <= 0) throw new IllegalArgumentException("spd must be > 0");

        if (critRate < 0 || critRate > 100) throw new IllegalArgumentException("critRate must be between 0 and 100");
        if (critDmg < 0) throw new IllegalArgumentException("critDmg must be >= 0");
        if (res < 0) throw new IllegalArgumentException("res must be >= 0");
        if (acc < 0) throw new IllegalArgumentException("acc must be >= 0");

        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.critRate = critRate;
        this.critDmg = critDmg;
        this.res = res;
        this.acc = acc;
        this.ignoreDef = ignoreDef;
    }

    public int getHp() { return hp; }
    public int getAtk() { return atk; }
    public int getDef() { return def; }
    public int getSpd() { return spd; }
    public int getCritRate() { return critRate; }
    public int getCritDmg() { return critDmg; }
    public int getRes() { return res; }
    public int getAcc() { return acc; }
    public int getIgnoreDef() { return ignoreDef; }
}
