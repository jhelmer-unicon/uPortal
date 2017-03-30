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
package org.apereo.portal.groups.filesystem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apereo.portal.groups.GroupsException;
import org.apereo.portal.groups.IEntitySearcher;
import org.apereo.portal.groups.IEntitySearcherFactory;

/**
 * Returns <code>IEntityGroupStore</code> and <code>IEntityStore</code> implementations for the file
 * system group service.
 *
 * @author Dan Ellentuck
 * @version $Revision$
 */
public class FileSystemEntitySearcherFactory implements IEntitySearcherFactory {
    private static final Log log = LogFactory.getLog(FileSystemEntitySearcherFactory.class);
    /** FileSytemEntitySearcherFactory constructor. */
    public FileSystemEntitySearcherFactory() {
        super();
    }
    /** @return org.apereo.portal.groups.filesystem.FileSystemGroupStore */
    protected static FileSystemGroupStore getGroupStore() throws GroupsException {
        return new FileSystemGroupStore();
    }

    public IEntitySearcher newEntitySearcher() throws GroupsException {
        return getGroupStore();
    }
}
