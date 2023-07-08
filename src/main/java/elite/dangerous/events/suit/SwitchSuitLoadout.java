/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.suit;

import java.util.ArrayList;

import elite.dangerous.base.Suit;
import elite.dangerous.models.LoadoutModule;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class SwitchSuitLoadout.
 */
@SuperBuilder
@Jacksonized
public class SwitchSuitLoadout extends Suit 
{

    /**
     * The suit mods.
     */
    public ArrayList<String>        suitMods;
    /**
     * The modules.
     */
    public ArrayList<LoadoutModule> modules;
}
