package loadToDirectory;

import dataBase.select.base.dataBase;
import dataBase.select.base.table;
import loadToDirectory.toFile.loadTable;

import java.io.File;

public class loadToDirectory {


    public void loadDb(dataBase db)
    {
        loadTable loadTable = new loadTable();
        for(table table:db.tables.values())
        {
         //   loadTable.
        }
    }

    public File createDirectory(String tableName )
    {
        /*generate new directory with specific key matching the table name*/
        return new File(String.format("/%s",tableName));
    }

}
