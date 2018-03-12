package ch03;

public interface Controller {
	Response processRequest(Request requset);
	void addHandler(Request request, RequestHandler requestHandler);
}
