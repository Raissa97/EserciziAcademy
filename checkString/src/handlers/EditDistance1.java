package handlers;

public class EditDistance1 extends EditDistance{

	public EditDistance1(CheckString next){
		this.setSogliaMax(1);
		this.setNext(next);
	}

}
