package com.xiaochen.jsonpath;

import cn.hutool.core.io.file.FileReader;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;

import java.io.File;

/**
 * @author Chenyufeng
 * @date 2023/1/31
 */
public class JsonPath {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader("D:\\apexWork\\studyProject\\my-camel-app\\doc\\test.json");
        String string = fileReader.readString();

        JSONObject jsonData = JSONObject.parse(string);
        Object data = JSONPath.eval(string, "$.store.book[0].category");
        System.out.println(String.valueOf(data));

        // set是个新的地址，不会改变旧的地址
        System.out.println(JSONPath.set(string, "$.store.book[0].category", "6666"));

        System.out.println(string);


//        FileReader fileReader1 = new FileReader("D:\\apexWork\\studyProject\\my-camel-app\\doc\\1.json");
//        String string1 = fileReader1.readString();
//        System.out.println(string1);



    }
}
