package com.xiaochen.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author Chenyufeng
 * @date 2023/2/21
 */
@RestController
@RequestMapping("/tests")
public class TestsController {

    @Autowired
    private FieldMetaManager fieldMetaManager;

    @RequestMapping("/ddl")
    public String parserDDL(@RequestParam("uploadFile") MultipartFile file) throws Exception {

        InputStreamReader isr;
        BufferedReader br;
        StringBuilder txtResult = new StringBuilder();
        try {
            isr = new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8);
            br = new BufferedReader(isr);
            String lineTxt;
            while ((lineTxt = br.readLine()) != null) {
                txtResult.append(lineTxt);
            }
            isr.close();
            br.close();
            fieldMetaManager.parserDDL(txtResult.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

        return null;
    }
}
