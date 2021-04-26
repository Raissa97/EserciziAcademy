package handlers;


public class EditDistance3 extends EditDistance{

	public EditDistance3(CheckString next){
		this.setSogliaMax(3);
		this.setNext(next);
	}

}
