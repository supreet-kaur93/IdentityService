package com.application.identity.dao;

import com.application.identity.mapper.UserDetailMapper;
import com.application.identity.model.UserDetail;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(UserDetailMapper.class)
public interface UserDetailDao {

    @SqlQuery("select * from user_details")
    List<UserDetail> getAll();

    @SqlQuery("select * from user_details where id = :id")
    UserDetail findById(@Bind("id") int id);

    @SqlUpdate("delete from user_details where id = :id")
    int deleteById(@Bind("id") int id);

    @SqlUpdate("update user_details set email = :email where id = :id")
    int updateEmail(@BindBean UserDetail userDetail);

    @SqlUpdate("update user_details set email = :email where id = :id")
    int updatePassword(@BindBean UserDetail userDetail);

    @SqlUpdate("update user_details set rating = :rating where id = :id")
    int updateRating(@BindBean UserDetail userDetail);

    @SqlUpdate("insert into user_details (id, email_id, password) values (:id, :emailId, :password)")
    int insert(@BindBean UserDetail userDetail);
}
