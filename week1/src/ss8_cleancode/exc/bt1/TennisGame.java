package ss8_cleancode.exc.bt1;

public class TennisGame {
    public static final char SUBTRACTION = '-';
    public static final int NUMBER_ZERO = 0;
    public static final int NUMBER_ONE = 1;
    public static final int NUMBER_TWO = 2;
    public static final int NUMBER_THREE = 3;
    public static final String ALL_VALUE = "ALL";
    public static final String VALUE_LOVE = "Love";
    public static final String VALUE_FIFTEEN = "Fifteen";
    public static final String VALUE_THIRTY = "Thirty";
    public static final String VALUE_FORTY = "Forty";


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
            case NUMBER_ZERO:
                return VALUE_LOVE + " - "+ ALL_VALUE;
            case NUMBER_ONE:
                return VALUE_FIFTEEN + " - "+ ALL_VALUE;
            case NUMBER_TWO:
                return VALUE_THIRTY + " - "+ ALL_VALUE;
            case NUMBER_THREE:
                return VALUE_FORTY + " - "+ ALL_VALUE;
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
                case NUMBER_ZERO:
                    score += VALUE_LOVE;
                    break;
                case NUMBER_ONE:
                    score += VALUE_FIFTEEN;
                    break;
                case NUMBER_TWO:
                    score += VALUE_THIRTY;
                    break;
                case NUMBER_THREE:
                    score += VALUE_FORTY;
                    break;
            }
        }
        return score;
    }
}