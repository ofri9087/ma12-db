package dataBase.select.base;

import work.matmon.db.dataType;

import java.util.HashMap;
import java.util.Set;

public class column {

    protected HashMap<dataType, dataType> values;


    public column() {
        this.values = new HashMap<>();
    }

    public void addValue(dataType data,dataType key) {
        this.values.put(key,data);
    }

    public void updateAll(String columnName, dataType newValue) {

        for (dataType key:this.values.keySet()){

            this.values.replace(key,newValue);
        }
    }

    public void updateSpecific(table currentTable, String columnName, dataType oldValue, dataType newValue) {

        String name = oldValue.publicName;
        Set<dataType> keys = this.values.keySet();
        for (dataType key : keys) {

            if(this.values.get(key).equals(oldValue))
                this.values.replace(key,newValue);
        }
    }

}
