/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.exploration;

import elite.dangerous.base.Event;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class MaterialCollected.
 */
@SuperBuilder
@Jacksonized
public class MaterialCollected extends Event 
{

    /**
     * The name.
     */
    public String  category, name;
    /**
     * The name localised.
     */
    public String  nameLocalised;
    /**
     * The count.
     */
    public Integer count;
}
