/******************************************************************************* 
 * Copyright (c) 2008 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Xavier Coulon - Initial API and implementation 
 ******************************************************************************/
package org.jboss.tools.web.pagereloader.internal.pubsub;

import java.util.EventObject;

/**
 * A filter that accepts any event ;-)
 * 
 * @author xcoulon
 * 
 */
public class NullEventFilter implements EventFilter {

	@Override
	public boolean apply(EventObject event) {
		return true;
	}

}