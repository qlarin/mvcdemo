
public class MVCTest {

	public static void main(String[] args) {
		Player model = getPlayerFromDB();
		
		PlayerView view = new PlayerView();
		PlayerController controller = new PlayerController(model, view);
		
		controller.updateView();
		controller.setPlayerNickname("Mark");
		controller.updateView();
		

	}
	
	private static Player getPlayerFromDB(){
		Player player = new Player();
		player.setNick("Tom");
		return player;
	}

}
