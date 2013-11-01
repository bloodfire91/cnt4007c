import java.net.Socket;

public class ModuleFactory {
	public static Module createConfigMod()
	{
		Configuration config = new Configuration();
		config.initialConfiguration();
		
		return config;
		
	}

	public static Module createLogMod(String peerID) {
		
		Logger log = new Logger(peerID);
		log.initialConfiguration();
		
		return log;
	}
	
	public static Module createCtrlMod(String peerID)
	{
		Controller controller = new Controller(peerID);
		controller.initialConfiguration();
		return controller;
	}
	
	public static Module createServerMod(String peerID, Controller controller)
	{
		Server server = new Server(peerID, controller);
		server.initialConfiguration();
		return server;
	}
	
	public synchronized static Module createPeer(Socket socket, Controller controller)
	{
		int count = 0;
		Peer peer = new Peer(socket, controller);
		peer.initialConfiguration();
		if(count < 3){count++;}
		System.out.println("CREATING PEER");
		return peer;
	}

	public static Module createTopPeerMod()
	{
			return null;
	}

	public static Module createOptimisticMod()
	{
			return null;
	}
}

