package Quiz;

// Update the code by implementing the following rules:

// 1. If an exception is thrown by s.execute() than call c.rollback() and
//      propagate the exception, otherwise call c.commit()

// 2. If any   , c.close() mast be called before leaving the method
//      a(Service s, Connection c)

public class A {
    /**
     * Execute the service with the given connection.
     */
    void a(Service s, Connection c) throws Exception {

        try {
            s.setConnection(c);
            s.execute();
            c.commit();
        } catch (Exception e) {
                c.rollback();
                throw e;
        } finally {
                c.close();
        }
    }
}
interface Service {
    void execute() throws Exception;
    void setConnection(Connection c);
}
interface Connection {
    void close();
    void rollback();
    void commit();
}
