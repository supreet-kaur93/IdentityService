package com.application.identity.mapper;

import com.application.identity.model.UserDetail;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDetailMapper implements ResultSetMapper<UserDetail> {

    public UserDetail map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new UserDetail(resultSet.getInt("id"), resultSet.getString("email_id"),
                resultSet.getString("password"), resultSet.getString("rating"));
    }
}
