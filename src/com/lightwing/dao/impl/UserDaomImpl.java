package com.lightwing.dao.impl;

import com.lightwing.dao.UserDao;
import com.lightwing.util.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class UserDaomImpl implements UserDao {
    @Override
    public boolean checkUserName(String username) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "SELECT COUNT(*) FROM t_user WHERE username = ?";
        runner.query(sql, new ScalarHandler(), username);
        Long result = (Long) runner.query(sql, new ScalarHandler(), username);
        return result > 0;
    }
}
