package handlers;

import java.util.ArrayList;

public interface CheckString {
	public void setNext(CheckString handler);
	Match check(ArrayList<String> dizionario, String s2);
}
