package ch03;

import java.util.HashMap;
import java.util.Map;

public class DefaultController implements Controller {
	
	private Map<String,RequestHandler> requestHandlers = new HashMap<String,RequestHandler>();
	
	protected RequestHandler getHandler(Request request) {
		if(!this.requestHandlers.containsKey(request.getName())){
			String message = "Cannot find handler for request name " + "["
			+ request.getName() + "]";
			throw new RuntimeException(message);
		}
		
		return this.requestHandlers.get(request.getName());
	}
	@Override
	public Response processRequest(Request requset) {
		Response response;
		try{
			response = getHandler(requset).process(requset);
		} catch (Exception exception){
			response = new ErrorResponse(requset,exception);
		}
		return response;
	}

	@Override
	public void addHandler(Request request, RequestHandler requestHandler) {
		if(this.requestHandlers.containsKey(request.getName())){
			throw new RuntimeException("A request handler has "
					+ "already been registered for request name " 
					+ "[" + request.getName() + "]");
		} else {
			this.requestHandlers.put(request.getName(), requestHandler);
		}

	}

}
