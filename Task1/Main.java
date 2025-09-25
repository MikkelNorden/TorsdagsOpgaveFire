import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		Team team0 = new Team("Hold A");

		team0.setRank(2);

		Team team1 = new Team("Hold B");
		team1.setRank(6);

		Team team2 = new Team("Hold C");
		team2.setRank(5);

		Team team3 = new Team("Hold D");
		team3.setRank(3);

		Team team4 = new Team("Hold E");
		team4.setRank(1);

		Team team5 = new Team("Hold F");
		team5.setRank(4);

		team0.addPlayer("PlayerA");

		String s0 = team0.toString();
		String s1 = team1.toString();
		String s2 = team2.toString();
		String s3 = team3.toString();
		String s4 = team4.toString();
		String s5 = team5.toString();

		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}