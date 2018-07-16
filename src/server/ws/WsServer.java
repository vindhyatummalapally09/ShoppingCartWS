package server.ws;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocketendpoint")
public class WsServer {
	
	@OnOpen
	public void onOpen(){
	    System.out.println("Open Connection ...");
	}

	
	@OnClose
	public void onClose(){
	    System.out.println("Close Connection ...");
	}


	@OnMessage
	public String onMessage(String data){
	    System.out.println("Message from the client: " + data);
	    //Save the data here and pass to form to show in front page
	    String echoMsg = data;
	    return echoMsg;
	}

	@OnError
	public void onError(Throwable e){
	    e.printStackTrace();
	}

}
