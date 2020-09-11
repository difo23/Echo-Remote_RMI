import java.rmi.Naming;

public class RemoteEchoFactory{
        public static RemoteEcho getEcho() throws Exception{
                return(RemoteEcho)Naming.lookup(
                "rmi://localhost:1099/"+ RemoteEcho.class.getName());
        }
}
