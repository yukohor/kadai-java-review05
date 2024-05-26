package baseball;

public class BaseBallTeam {

    private String baseBallTeamName;
    private int baseBallTeamWin;
    private int baseBallTeamLose;
    private int baseBallTEamDraw;
    public int report;
    public double result;

    public BaseBallTeam() {
    }

    public BaseBallTeam(String baseBallTeamName, int baseBallTeamWin, int baseBallTeamLose, int baseBallTeamDraw) {
        this.baseBallTeamName = baseBallTeamName;
        this.baseBallTeamWin = baseBallTeamWin;
        this.baseBallTeamLose = baseBallTeamLose;
        this.baseBallTEamDraw = baseBallTeamDraw;

    }

    public void report() {
        result = getRate();
        System.out.println(this.baseBallTeamName + "の2022年の成績は" + this.baseBallTeamWin + "勝" + this.baseBallTeamLose
                + "敗" + this.baseBallTEamDraw + "分、勝率は" + getRate() + "です。");
    }

    double getRate() {
        double result = this.baseBallTeamWin / (double) (this.baseBallTeamWin + this.baseBallTeamLose);
        return result;
    }

    public String getBaseBallName() {
        return baseBallTeamName;
    }

    public void setbaseBallTeamName(String baseBallTeamName) {
        this.baseBallTeamName = baseBallTeamName;
    }

    public int getbaseBallTeamWin() {
        return baseBallTeamWin;
    }

    public void setbaseBallTeamWin(int baseBallTeamWin) {
        this.baseBallTeamWin = baseBallTeamWin;
    }

    public int getbaseBallTeamLose() {
        return baseBallTeamLose;
    }

    public void setbaseBallTeamLose(int baseBallTeamLose) {
        this.baseBallTeamLose = baseBallTeamLose;
    }

    public int getbaseBallTeamDraw() {
        return baseBallTEamDraw;
    }

    public void setbaseBallTeamDraw(int baseBallTEamDraw) {
        this.baseBallTEamDraw = baseBallTEamDraw;

    }
}
