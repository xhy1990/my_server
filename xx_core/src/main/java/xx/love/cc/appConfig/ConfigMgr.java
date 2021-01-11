package xx.love.cc.appConfig;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 配置管理类
 *
 * @author xhy
 * @date 2020/9/18 19:41
 */
public class ConfigMgr {

    public static ServerConfig serverConfig;

    public static boolean init() {
        try {
            initServerConfig();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void initServerConfig() throws Exception {
        Properties properties = new Properties();
        BufferedInputStream bufferedInputStream = null;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("config/server.properties");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            properties.load(bufferedInputStream);

            serverConfig = buildPropertiesConfig(properties, ServerConfig.class);
        } finally {
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
                bufferedInputStream = null;
            }
        }
    }


    /**
     * 哈哈
     *
     * @param properties
     * @param c
     * @param <T>
     * @return
     */
    public static <T> T buildPropertiesConfig(Properties properties, Class<T> c) throws Exception {
        Field[] fields = c.getDeclaredFields();
        Map<String, Field> fieldMap = Stream.of(fields).collect(Collectors.toMap(Field::getName, a -> a, (k1, k2) -> k2));
        // 初始化参数
        Enumeration<Object> keys = properties.keys();
        String key;
        Field field;
        T config = c.newInstance();
        while (keys.hasMoreElements()) {
            key = (String) keys.nextElement();
            if (!fieldMap.containsKey(key)) {
                continue;
            }
            field = fieldMap.get(key);
            field.setAccessible(true);
            setField(config, field, properties, key);
        }
        return config;
    }

    private static <T> void setField(T config, Field field, Properties properties, String key) throws Exception {
        String typeName = field.getType().getName();
        if (typeName.contains("String")) {
            field.set(config, properties.get(key));
        } else if (typeName.contains("char")) {
            field.set(config, properties.get(key));
        } else if (typeName.contains("byte")) {
            field.set(config, Byte.parseByte(String.valueOf(properties.get(key))));
        } else if (typeName.contains("short")) {
            field.set(config, Short.parseShort(String.valueOf(properties.get(key))));
        } else if (typeName.contains("int")) {
            field.set(config, Integer.parseInt(String.valueOf(properties.get(key))));
        } else if (typeName.contains("long")) {
            field.set(config, Long.parseLong(String.valueOf(properties.get(key))));
        } else if (typeName.contains("float")) {
            field.set(config, Float.parseFloat(String.valueOf(properties.get(key))));
        } else if (typeName.contains("double")) {
            field.set(config, Double.parseDouble(String.valueOf(properties.get(key))));
        } else if (typeName.contains("boolean")) {
            field.set(config, Boolean.parseBoolean(String.valueOf(properties.get(key))));
        } else {
            throw new Exception("Unsupported Class Type:" + typeName);
        }
    }


}
