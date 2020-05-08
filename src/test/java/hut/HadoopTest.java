package hut;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : zhw
 * @Date: 2020/5/8
 * @Description: bigdatademo
 * @version: 1.0
 */


public class HadoopTest {

    private Configuration conf;
    private FileSystem fileSystem;

    /**
     * 测试连接hdfs，并读取文件内容。
     * @throws IOException
     */
    @Test
    public void testHadoopConection () throws IOException {
        //FileStatus[] fileStatuses = fileSystem.listStatus ( new Path ( "/user/hadoop/demo/test.txt" ) );

        System.out.println ( "fileSystem.exists ( new Path ( \"demo\" ) ) = " + fileSystem.exists ( new Path ( "/user/hadoop/demo/test.txt" ) ) );
        FSDataInputStream open = fileSystem.open ( new Path ( "/user/hadoop/demo/test.txt" ) );
        BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( open ) );
        String s = bufferedReader.readLine ( );
        System.out.println ( "s = " + s );
    }



    @Before
    public void setUp () throws Exception {
        conf = new Configuration ( );
        conf.set ( "fs.defaultFS", "hdfs://39.97.228.138:9001" );
        conf.setBoolean ( "dfs.client.use.datanode.hostname", true );
        fileSystem = FileSystem.get ( conf );
    }

    @After
    public void tearDown () throws Exception {
        fileSystem.close ();
    }
}
