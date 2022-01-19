package work.matmon.db;

import java.util.HashMap;

public class typeFactory {

    private HashMap<String,dataType> types;

    public typeFactory() {
        this.types = new HashMap<>();
    }

    public void addType(dataType type)
    {
        this.addType(type);
    }

    public dataType getType(String name)
    {
        return this.types.get(name);
    }
}
