package adapter;

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    Properties properties;

    @Override
    public void readFromFile(String filename) {
        File file = new File(filename);
        try {

            file.createNewFile();

            FileReader fr = new FileReader(file);
            properties = new Properties();
            properties.load(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        FileWriter file = new FileWriter(new File(filename));

        properties.store(file, "written by FileProperties");
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
