package loadToDirectory.toFile;

import dataBase.select.base.column;
import dataBase.select.base.table;

import java.io.File;

public class loadTable implements CSVloader {


    public void loadToFile(File file,table table) {

        loadColumn ld = new loadColumn();

        for (column col:table.getColumns().values()) {

            //ld.loadToFile(createFile());
        }

    }

    /**
     * create new file of each column
     * @param name -column name
     * @return - the file
     */
    public File createFile(String name) {
        return null;
    }
}
