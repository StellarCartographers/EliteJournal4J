/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.models.toreadable;

/**
 * The Class ReputationName.
 */
public class ReputationName {

	/**
     * Gets the readable name.
     *
     * @param reputation the reputation
     * @return the readable name
     */
	public static String getReadableName(Double reputation) {
		String repName = "Neutral";

		if (reputation >= 90) {
			repName = "Allied";
		} else if (reputation >= 35) {
			repName = "Friendly";
		} else if (reputation >= 4) {
			repName = "Cordinal";
		} else if (reputation <= -90) {
			repName = "Hostile";
		} else if (reputation <= -35) {
			repName = "Unfriendly";
		}

		return repName;
	}
}
