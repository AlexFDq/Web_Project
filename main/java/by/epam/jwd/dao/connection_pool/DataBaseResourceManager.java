package by.epam.jwd.dao.connection_pool;

import java.util.ResourceBundle;

public class DataBaseResourceManager {
    private final static DataBaseResourceManager instance = new DataBaseResourceManager();
    private final String BUNDLE_NAME = "database";

    private ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME);

    public static DataBaseResourceManager getInstance() {
        return instance;
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }
}

