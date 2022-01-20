package loadToDirectory.toFile;

import dataBase.select.base.column;
import work.matmon.db.dataType;

import java.io.File;
import java.util.HashMap;

public class loadColumn implements CSVloader<dataType, dataType> {


    public void loadToFile(File file, column column) {

        /*load hashMap of this spesific column into the file and it will show like that:
        * key -> value
        * which is storing data by column with the same data type
        * */
    }

    public File createFile(String name) {
        return null;
    }
}
