package com.xiaochen.controller;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Chenyufeng
 * @date 2023/2/21
 */
@Service
public class FieldMetaManagerImpl implements FieldMetaManager{

    @Override
    public void parserDDL(String ddl) {
//        String fullSql = SQLUtils.formatMySql(ddl);
//        fullSql = fullSql.replace("\"", "");
        List<SQLStatement> sqlStatements = SQLUtils.parseStatements(ddl, "mysql");

    }

}
