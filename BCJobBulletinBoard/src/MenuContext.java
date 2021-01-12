
public class MenuContext {

	private MenuState state;
	
	public MenuContext(MenuState state) {
		this.state = state;
	}
	
	public void displayPage() {
		this.state.displayPage();
	}
	
	public void changeState(MenuState state) {
		this.state = state;
	}

}
