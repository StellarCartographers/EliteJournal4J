/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.other;

import elite.dangerous.base.Event;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class FuelScoop.
 */
@SuperBuilder
@Jacksonized
public class FuelScoop extends Event 
{

    /**
     * The scooped.
     */
    public Float   scooped;
    /**
     * The total.
     */
    public Integer total;
}
