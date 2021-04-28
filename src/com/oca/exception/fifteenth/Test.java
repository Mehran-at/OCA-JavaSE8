package com.oca.exception.fifteenth;

import java.io.IOException;
import java.sql.SQLException;

class Test {

    public static void main(String[] args) {
        /*INSERT*/
        try {
            save();
            log();
        } catch (IOException | SQLException ex) { /* As IOException and SQLException are not related to each other in
                                                     multi-level inheritance, hence this multi-catch syntax is valid. */
        } /* catch (IOException | Exception ex) { // Causes compilation error as IOException extends Exception.

        } catch SQLException | Exception ex) { // Causes compilation error as SQLException extends Exception.

        } catch(Exception | RuntimeException ex) { // Causes compilation error as RuntimeException extends Exception.

        } */ catch (Exception ex) { // Java allows to catch only Exception type from checked exception without declaring it.

        }
    }

    private static void save() throws IOException { // Checked exception

    }

    private static void log() throws SQLException { // Checked exception

    }
}