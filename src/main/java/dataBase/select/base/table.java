package dataBase.select.base;

import entity.entity;
import work.matmon.db.dataType;

import java.util.HashMap;

public class table {

    protected HashMap<String,column> columns; /*String = headers of columns*/

    public HashMap<String, column> getColumns() {
        return columns;
    }

    public table() {
        this.columns = new HashMap<>();
    }
    public void addValueToColumn(column column,String columnName)
    {
        this.columns.putIfAbsent(columnName,column);
    }

    public column getColumn(String columnName)
    {
        return this.columns.get(columnName);
    }

    public column select(String columnName) {

        return  this.columns.get(columnName);
    }

    public void createNewColumnIfAbsent(String colName)
    {
        this.columns.putIfAbsent(colName,new column());
    }

    public void addEntity(entity entity)
    {
        for (String dataName:entity.getAllFieldsOfEntity().keySet()) {

                this.createNewColumnIfAbsent(dataName);/*creating new col if not exists*/
                this.columns.get(dataName).addValue(entity.getAllFieldsOfEntity().get(dataName),
                                                    entity.getKey());
        }

    }

    public void deleteEntity(dataType key)
    {
        for(column col : this.columns.values())
        {
            col.values.remove(key);
        }
    }
}
