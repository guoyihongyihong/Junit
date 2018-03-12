package ch03;

public interface RequestHandler {
	Response process(Request request) throws Exception;
}
