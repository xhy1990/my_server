package xx.love.cc.message;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import static xx.love.cc.ToolsConstants.GEN_JAVA_PATH;
import static xx.love.cc.ToolsConstants.PROTOC_PATH;
import static xx.love.cc.ToolsConstants.PROTO_DESC_FILE;
import static xx.love.cc.ToolsConstants.PROTO_PATH;
import static xx.love.cc.ToolsConstants.TOOLS_RES_PATH;

/***
 * proto自动生成工具
 * @author xhy
 */
public class MessageGenerator {

    public static void exeProtoc() throws Exception {
        Runtime run = Runtime.getRuntime();

        String cmd = "cmd /c " + PROTOC_PATH
                + " " + "-I=" + TOOLS_RES_PATH
                + " " + "--java_out=" + GEN_JAVA_PATH
                + " " + "--include_imports"
                + " " + "--include_source_info"
                + " " + "--descriptor_set_out=" + PROTO_DESC_FILE
                + " " + PROTO_PATH + File.separator + "*.proto";

        System.out.println(cmd);
        Process p = run.exec(cmd);

        // 如果不正常终止, 则生成desc文件失败
        if (p.waitFor() != 0) {
            //p.exitValue()==0表示正常结束，1：非正常结束
            if (p.exitValue() == 1) {
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                br.lines().forEach(System.err::println);
                System.err.println("命令执行失败!");
                br.close();
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        exeProtoc();
    }
}
