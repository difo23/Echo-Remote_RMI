import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

class RemoteEchoServer extends UnicastRemoteObject implements RemoteEcho{
        public RemoteEchoServer () throws RemoteException{}
        public Object echo(Object object) throws RemoteException {
                return object;
        }

        public static void main (String[] args) throws Exception{
                RemoteEchoServer server = new RemoteEchoServer();
                Naming.rebind(RemoteEcho.class.getName(), server);
        }
}
