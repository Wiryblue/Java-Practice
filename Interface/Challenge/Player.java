package Section9.Interface.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    public String NAME;
    private int hitPoints;
    private int strengths;
    private String weapon;

    public Player(String NAME, int hitPoints, int strengths) {
        this.NAME = NAME;
        this.hitPoints = hitPoints;
        this.strengths = strengths;
        this.weapon = "Sword";

    }

    public String getNAME() {
        return NAME;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrengths() {
        return strengths;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }




    @Override
    public String toString() {
        return "Player{" +
                "NAME='" + NAME + '\'' +
                ", hitPoints=" + hitPoints +
                ", strengths=" + strengths +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.NAME);
        values.add(1, " " + this.hitPoints);
        values.add(2, " " + this.strengths);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if(savedValues != null && savedValues.size() > 0){

            this.NAME = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strengths = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);

        }
    }
}
