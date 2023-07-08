/**
 * Copyright (c) 2023  The Stellar Cartographers' Guild. All rights reserved.
 *
 * This work is licensed under the terms of the MIT license.
 * For a copy, see <https://opensource.org/licenses/MIT>.
 */
package elite.dangerous.models.scan;

/**
 * The Class Parent.
 */
public class Parent {

	/**
     * The body type.
     */
	public String bodyType;
	
	/**
     * The body ID.
     */
	public Integer bodyID;

	/**
     * Instantiates a new parent.
     *
     * @param bodyType the body type
     * @param bodyID the body ID
     */
	public Parent(String bodyType, Integer bodyID) {
		this.bodyType = bodyType;
		this.bodyID = bodyID;
	}
}
