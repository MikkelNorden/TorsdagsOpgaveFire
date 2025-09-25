import java.util.ArrayList;

class Team{
	private String teamName;
	private int rank;
	private ArrayList<String> playerNames = new ArrayList<>();

	public Team(String teamName){
		this.teamName = teamName;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public String toString(){
		return "Hold: " + this.teamName + " " + "Rang: " + this.rank + " " + this.playerNames;
	}

	public void addPlayer(String playerName){
		playerNames.add(playerName);
	}
}