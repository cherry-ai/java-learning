package com.cherry;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: liuq
 * @Date: 2021/3/23 14:53
 */
@Slf4j
public class DemoTest {

//    private static final Logger LOGGER = LoggerFactory.getLogger(DemoTest.class);

    @Test
    public void getTXTContent(){

        log.info("44444444444getTXTContent");

        try {
            String filePath = "D:/jcw.txt";
            FileInputStream fin = new FileInputStream(filePath);
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader buffReader = new BufferedReader(reader);
            String strTmp = "";
            while((strTmp = buffReader.readLine())!=null){
                System.out.println(strTmp);
            }
            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
