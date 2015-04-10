
public class PlayerController {

	private Player model;
	private PlayerView view;
	
	public PlayerController(Player model, PlayerView view){
		this.model = model;
		this.view = view;
	}

	public String getPlayerNickname() {
		return model.getNick();
	}

	public void setPlayerNickname(String nick) {
		model.setNick(nick);
	}

	public void updateView(){
		view.showPlayerDetails(model.getNick());
	}
}
