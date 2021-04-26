package handlers;

public class Match {

	private String algoritmo;
	private String result;
	
	
	public Match(String algoritmo, String result) {
		this.algoritmo = algoritmo;
		this.result = result;
	}
	public String getAlgoritmo() {
		return algoritmo;
	}
	public void setAlgoritmo(String algoritmo) {
		this.algoritmo = algoritmo;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Match [algoritmo=" + algoritmo + ", result=" + result + "]";
	}
	
	
}
