/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.powerplay;

import elite.dangerous.base.Event;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class PowerplayDefect.
 */
@SuperBuilder
@Jacksonized
public class PowerplayDefect extends Event 
{

    /**
     * The from power.
     */
    public String fromPower;
    /**
     * The to power.
     */
    public String toPower;
}
