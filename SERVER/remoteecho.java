import java.rmi.RemoteException;

public interface RemoteEcho extends java.rmi.Remote {
        Object echo(Object object) throws RemoteException;
     
}
