/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.combat;

import java.util.List;

import elite.dangerous.models.Killer;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class DiedByWing.
 */
@SuperBuilder
@Jacksonized
public class DiedByWing extends Died 
{

    /**
     * The killers.
     */
    public List<Killer> killers;
}
