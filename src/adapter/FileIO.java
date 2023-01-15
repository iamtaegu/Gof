package adapter;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileIO {

    public void readFromFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public void writeToFile(String filename) throws IOException;
    public String getValue(String key);

}
