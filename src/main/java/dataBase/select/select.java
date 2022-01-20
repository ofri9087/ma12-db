package dataBase.select;

import dataBase.select.base.column;
import dataBase.select.base.table;

public abstract class select {

    public column select(String columnName, table table) {

        return table.getColumn(columnName);

    }



}
