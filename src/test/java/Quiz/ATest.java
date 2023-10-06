package Quiz;

import static org.junit.jupiter.api.Assertions.*;

class ATest {

    Service service = new Service() {
        @Override
        public void execute() throws Exception {
            System.out.println("execute");
        }

        @Override
        public void setConnection(Connection c) {
            System.out.println("setConnections");

        }
    };
}