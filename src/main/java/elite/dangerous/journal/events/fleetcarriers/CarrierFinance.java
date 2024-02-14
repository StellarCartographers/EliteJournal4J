/*
 * This file is part of Elite4J, licensed under MIT.
 * 
 * Copyright (c) 2024 StellarCartographers.
 * 
 * You should have received a copy of the MIT license along with this program.  
 * If not, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.journal.events.fleetcarriers;

import lombok.*;

import elite.dangerous.journal.Event;

@EliteObject 
public class CarrierFinance extends Event
{

    private double taxRate, reservePercent;

    private long   carrierID, carrierBalance, reserveBalance, availableBalance;

}
