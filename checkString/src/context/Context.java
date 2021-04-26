package context;

import java.util.ArrayList;

import handlers.*;

public class Context {

	private CheckString start;
	
	public Context(CheckString start) {
		this.start = start;
	}
	
	public Match check(ArrayList<String> dizionario, String s2) {
		return this.start.check(dizionario,s2);
	}
}
