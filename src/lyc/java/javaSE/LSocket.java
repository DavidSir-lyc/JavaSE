package lyc.java.javaSE;

import java.net.Socket;

public class LSocket {
    void someFun() throws Exception {
        Socket socket = new Socket();
        System.out.println(socket.getLocalPort());
    }
}
