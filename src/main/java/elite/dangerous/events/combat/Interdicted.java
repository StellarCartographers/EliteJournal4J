/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.combat;

import elite.dangerous.base.Event;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class Interdicted.
 */
@SuperBuilder
@Jacksonized
public class Interdicted extends Event 
{

    /**
     * The is player.
     */
    public Boolean submitted, isPlayer;
    /**
     * The power.
     */
    public String  interdictor, faction, power;
    /**
     * The combat rank.
     */
    public Integer combatRank;
}
