/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.events.other;

import com.google.gson.annotations.SerializedName;

import elite.dangerous.base.Event;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The Class CrewLaunchFighter.
 */
@SuperBuilder
@Jacksonized
public class CrewLaunchFighter extends Event 
{

    /**
     * The crew.
     */
    public String crew;
    /**
     * The id.
     */
    @SerializedName("ID")
    public Long   id;
}
