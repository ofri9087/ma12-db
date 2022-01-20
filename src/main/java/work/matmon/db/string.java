package work.matmon.db;

public class string extends dataType implements Comparable<string>{

    private String string;

    public string(String string) {

        this.string = string;
        this.publicName ="string";
    }

    public String getString() {
        return string;
    }

    @Override
    public int compareTo(string o) {
        if(o.getString()==this.string)
            return 1;
        else return 0;
    }
}
