/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.stationservices;

import elite.dangerous.base.Event;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class BuyAmmo.
 */
@SuperBuilder
@Jacksonized
public class BuyAmmo extends Event 
{

    /**
     * The cost.
     */
    public Integer cost;
}
