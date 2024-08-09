import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LiveScoreBean source = new LiveScoreBean();

        PPTVListener pptv = new PPTVListener();
        TrueVisionListener trueVision = new TrueVisionListener();

        source.addListenerProperty(pptv);
        source.addListenerProperty(trueVision);

        System.out.print("Enter score: ");
        String scoreLine = in.nextLine();

        while(!scoreLine.equals("")){
            source.setScoreLine(scoreLine);

            System.out.print("Enter score: ");
            scoreLine = in.nextLine();
        }
        
        in.close();
    }
}
