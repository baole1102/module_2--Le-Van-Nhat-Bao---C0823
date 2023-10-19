package ss8_cleancode.exc.bt1;

public class TennisGame {
    public static final char SUBTRACTION = '-';

    public static String getScore(String firstPlayer, String secondPlayer, int scoreOne, int scoreTwo) {
        if (scoreOne == scoreTwo) {
            return getEqualScore(scoreOne);
        } else if (scoreOne >= 4 || scoreTwo >= 4) {
            return getEndGameScore(scoreOne, scoreTwo);
        } else {
            return getRegularScore(scoreOne, scoreTwo);
        }
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getEndGameScore(int scoreOne, int scoreTwo) {
        int minusResult = scoreOne - scoreTwo;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getRegularScore(int scoreOne, int scoreTwo) {
        String score = "";
        for (int i = 1; i < 3; i++) {
            int tempScore = (i == 1) ? scoreOne : scoreTwo;
            if (i == 2) {
                score += SUBTRACTION;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}