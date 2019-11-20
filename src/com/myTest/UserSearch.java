package com.myTest;

import com.sun.istack.internal.NotNull;

import java.util.Optional;

public interface UserSearch {

    /**
     *
     * @param id
     * @return User 用户
     * @exception
     */
    Optional<User> getUsers(@NotNull String id);
}
