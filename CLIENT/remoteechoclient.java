import java.rmi.RemoteException;

class RemoteEchoClient{
        public static void main(String[] args) throws Exception{
         RemoteEcho echo= RemoteEchoFactory.getEcho();
         System.out.println(echo.echo("eco ecoooo!"));
        }
}
