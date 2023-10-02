package elite.dangerous.journal.models.toreadable;

public class CombatRank
{

    private static final String[] LOCALISED_NAMES = {"Harmless", "Mostly Harmless", "Novice", "Competent", "Expert", "Master", "Dangerous", "Deadly", "Elite"};

    /**
     * Gets the readable name.
     *
     * @param rank the rank
     * @return the readable name
     */
    public static String getReadableName(int rank)
    {
        return LOCALISED_NAMES[rank];
    }

    /**
     * Gets the rank.
     *
     * @param rankName the rank name
     * @return the rank
     */
    public static int getRank(String rankName)
    {
        int rank = 0;

        for (int i = 0; i < LOCALISED_NAMES.length; i++)
        {
            if (LOCALISED_NAMES[i].equals(rankName))
            {
                rank = i;
            }
        }

        return rank;
    }
}
