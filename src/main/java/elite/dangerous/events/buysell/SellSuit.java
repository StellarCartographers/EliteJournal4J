/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.buysell;

import elite.dangerous.base.Event;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class SellSuit.
 */
@SuperBuilder
@Jacksonized
public class SellSuit extends Event 
{

    /**
     * The name.
     */
    public String name;
    /**
     * The name localised.
     */
    public String nameLocalised;
    /**
     * The price.
     */
    public Long   price;
    /**
     * The suit ID.
     */
    public Long   suitID;
}
