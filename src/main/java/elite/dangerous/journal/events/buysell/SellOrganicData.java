/*
 * This file is part of Elite4J, licensed under MIT.
 * 
 * Copyright (c) 2024 StellarCartographers.
 * 
 * You should have received a copy of the MIT license along with this program.
 * If not, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.journal.events.buysell;

import lombok.*;

import java.util.ArrayList;

import elite.dangerous.journal.Event;
import elite.dangerous.model.BioDataItem;

@EliteObject 
public class SellOrganicData extends Event
{
    private int                    marketID;
    private ArrayList<BioDataItem> bioData;
}
