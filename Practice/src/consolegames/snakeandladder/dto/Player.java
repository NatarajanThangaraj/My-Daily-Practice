package consolegames.snakeandladder.dto;

public class Player {
 private String playerName;
 private int current;
 private int prev;

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String player) {
	this.playerName = player;
}

public int getCurrentPosition() {
	return current;
}

public void setCurrentPosition(int currentPosition) {
	this.current = currentPosition;
}

public int getPrev() {
	return prev;
}

public void setPrev(int prev) {
	this.prev = prev;
}


}
