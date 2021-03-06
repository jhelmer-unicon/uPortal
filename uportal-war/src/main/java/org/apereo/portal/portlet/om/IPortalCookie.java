/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apereo.portal.portlet.om;

import java.util.Set;
import org.joda.time.DateTime;

/**
 * Interface describing the parent cookie used to relate all Portlet Cookies to one HTTP Cookie.
 *
 * @author Nicholas Blair
 */
public interface IPortalCookie {

    /** @return the unique value for this cookie */
    String getValue();

    /** @return the timestamp when this cookie was created */
    DateTime getCreated();

    /** @return the timestamp when this cookie is due to expire */
    DateTime getExpires();

    /**
     * Update the expiration timestamp.
     *
     * @param expires
     */
    void setExpires(DateTime expires);

    /** @return the set of {@link IPortletCookie}s linked to this instance */
    Set<IPortletCookie> getPortletCookies();
}
