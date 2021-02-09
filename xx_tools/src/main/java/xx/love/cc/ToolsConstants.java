package xx.love.cc;

import java.io.File;

/**
 * @author xhy
 */
public class ToolsConstants {
    public static String TOOLS_PATH = System.getProperty("user.dir") + File.separator + "xx_tools";
    public static String GEN_PATH = System.getProperty("user.dir") + File.separator + "xx_gen";

    public static String SRC_DIC = "src" + File.separator + "main" + File.separator + "java";
    public static String RES_DIC = "src" + File.separator + "main" + File.separator + "resources";

    public static final String GEN_JAVA_PATH = GEN_PATH + File.separator + SRC_DIC;
    public static final String TOOLS_RES_PATH = TOOLS_PATH + File.separator + RES_DIC;

    public static final String PROTOC_PATH = TOOLS_PATH + File.separator + "tools" + File.separator + "protoc" + File.separator + "bin"
            + File.separator + "protoc.exe";

    public static final String PROTO_PATH = TOOLS_RES_PATH + File.separator + "message" + File.separator + "proto";
    public static final String PROTO_DESC_FILE = PROTO_PATH + File.separator + "message.desc";

}
