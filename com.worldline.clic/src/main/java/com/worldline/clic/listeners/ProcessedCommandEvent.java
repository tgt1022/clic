/*
 * CLiC, Framework for Command Line Interpretation in Eclipse
 *
 *     Copyright (C) 2013 Worldline or third-party contributors as
 *     indicated by the @author tags or express copyright attribution
 *     statements applied by the authors.
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
package com.worldline.clic.listeners;

import com.worldline.clic.listeners.internal.IEvent;

/**
 * 
 * Event implementation, used when command is processed
 * 
 * @author mvanbesien
 * @version 1.0
 * 
 */
public class ProcessedCommandEvent implements IEvent {

	// TO BE COMPLETED WITH OTHER INFORMATION IF NEEDED

	/**
	 * Command
	 */
	private String command;

	/**
	 * @return the invoked command
	 */
	protected String getCommand() {
		return this.command;
	}

	/**
	 * Creates new processed command event with command provided.
	 * 
	 * @param command
	 */
	public ProcessedCommandEvent(String command) {
		this.command = command;
	}

}
