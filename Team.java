package main;
import java.util.ArrayList;

public class Team {
	
	private String name;
	private ArrayList<Player> listofplayers= new ArrayList<Player>();
	private int maxplayers= 16;
	
	public Team(String teamname) {
		this.name=teamname;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addPlayer(Player player) {
		if (this.size()<this.maxplayers){
		this.listofplayers.add(player);
		}
	}
	
	public void printPlayers() {
		System.out.println("The players in this team: ");
		for (Player p:this.listofplayers) {
			System.out.println(p);
		}
	}
	
	public void setMaxSize(int size) {
		this.maxplayers= size;
	}

	public int size() {
		return this.listofplayers.size();
	}
	
	public int goals() {
		int sum=0;
		for(Player p: this.listofplayers) {
			sum+=p.goals();
		}
		return sum;
	}
	
}
