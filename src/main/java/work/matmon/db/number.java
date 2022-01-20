package work.matmon.db;


import java.util.Objects;

public class number extends dataType
{

    private double number;

    public number(double number) {
        this.number = number;
        this.publicName ="number";
    }

    public double getNumber() {
        return number;
    }
    public int compareTo(number o) {
        if(o.getNumber() == this.number)
            return 1;
        else return 0;
    }

}
