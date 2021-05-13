public class CricketScores {
	static String getDisplayDetailes(int runs, double overs) {
		String str = "";
		int count = (int)(overs * 10);
		int qe = count / 10;
		int rem= count % 10;
		int balls = (qe * 6) + rem ;
		if((runs < 100) || (balls < 100)){
			str = str + runs + " runs in " + balls + " balls " + " @ " + String.format("%.2f", (runs / balls)) + " runs per ball";
		}
		else {
			str = str + runs + " runs in " + overs + " overs " + " @ " + String.format("%.2f", (runs / overs)) + " runs per over";
		}
		return str;
	}
	public static void main(String[] args) {
		double b=20.4;
		System.out.println(getDisplayDetailes(100, 20));
		}

}

