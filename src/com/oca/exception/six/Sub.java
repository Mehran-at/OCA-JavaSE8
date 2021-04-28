package com.oca.exception.six;

import java.io.FileNotFoundException;

class Sub extends Super {

//    @Override
//    public void m1() throws IOException {
//
//        throw new FileNotFoundException();
//    }

//    @Override
//    public void m1() throws RuntimeException, IOException {
//
//        throw new FileNotFoundException();
//    }

//    @Override
//    public void m1() throws Error, IOException {
//
//        throw new FileNotFoundException();
//    }

//    @Override
//    public void m1() {
//
//        throw new FileNotFoundException();
//    }

    @Override
    public void m1() throws FileNotFoundException { /* It's a subclass of IOException, so no error here. */

        throw new FileNotFoundException();
    }

//    @Override
//    public void m1() throws SocketException, FileNotFoundException {
//
//        throw new FileNotFoundException();
//    }

//    @Override
//    public void m1() throws SQLException, FileNotFoundException { /* SQLException is not related to IOException, so
//    compilation error here. */
//
//        throw new FileNotFoundException();
//    }
}
