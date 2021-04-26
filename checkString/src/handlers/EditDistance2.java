package handlers;

public class EditDistance2 extends EditDistance{

	public EditDistance2(CheckString next){
		this.setSogliaMax(2);
		this.setNext(next);
	}
	 
}
