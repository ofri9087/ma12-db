package entity;

import work.matmon.db.dataType;
import work.matmon.db.typeFactory;

import java.util.HashMap;

public class entity {

    private typeFactory types;
    private HashMap<String, dataType> allFieldsOfEntity;
    private dataType key;

    public entity(typeFactory types, dataType key) {
        this.types = types;
        this.allFieldsOfEntity = new HashMap<>();
        this.key = key;
    }

    public HashMap<String, dataType> getAllFieldsOfEntity() {
        return allFieldsOfEntity;
    }

    public dataType getKey() {
        return key;
    }

    public void addData(dataType data)
    {
        this.addData(data);
    }


}
