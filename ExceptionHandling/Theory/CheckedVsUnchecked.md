
Checked Exception: Compile Time . e.g.: IOException, SQLException,
ClassNotFoundException

Unchecked Exception : Runtime .e.g: IndexOutOfBoundException, Null Pointer Exception, Number Format Exception.


                                                 --> ClassNotFoundException
                                                |
Throwable --> Exception --> Checked Exception -----> SQL Exception
                        |                       |
                        \/                       --> IO Exception
                    Unchecked Exception
                        |
                        ------> IndexOutOfBound Exception
                        |
                        ------> Null Pointer Exception
                        |
                        ------> Number Format Exception

