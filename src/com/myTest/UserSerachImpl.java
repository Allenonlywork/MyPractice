package com.myTest;

import com.sun.istack.internal.NotNull;

import java.util.Optional;

public class UserSerachImpl implements UserSearch {

    @Override
    public Optional<User> getUsers(String id) {
        return Optional.empty();
    }
}
