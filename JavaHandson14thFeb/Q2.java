import java.util.Locale;

public class Q2 {
    public static void main(String[] args) {
        int bowler=0,fielder=0,batsman=0;
        String []team = {"MS. Dhoni Batsman","Malinga Bowler","Hardik Fielder","Ravi Bishnoi Fielder"};
        for (int i = 0; i < team.length; i++) {
            if(team[i].toLowerCase(Locale.ROOT).contains("Batsman".toLowerCase(Locale.ROOT)))
                batsman++;
            else if(team[i].toLowerCase(Locale.ROOT).contains("Bowler".toLowerCase(Locale.ROOT)))
                bowler++;
            else if(team[i].toLowerCase(Locale.ROOT).contains("Fielder".toLowerCase(Locale.ROOT)))
                fielder++;
        }
        System.out.println("Batsman : "+batsman+"\nBowler : "+bowler+"\nFielder : "+fielder);
    }
}
