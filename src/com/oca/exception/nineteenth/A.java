package com.oca.exception.nineteenth;

import java.sql.SQLException;

interface A {

    void multiply(int... x) throws SQLException; // checked exception
}