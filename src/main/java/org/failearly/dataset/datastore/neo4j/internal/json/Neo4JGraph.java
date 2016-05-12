/*
 * dataZ - Test Support For Data Stores.
 *
 * Copyright (C) 2014-2016 'Marko Umek' (http://fail-early.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.failearly.dataset.datastore.neo4j.internal.json;

import java.util.List;

/**
 * Neo4JGraph is responsible for ...
 */
@SuppressWarnings("unused")
public final class Neo4JGraph {
    private List<Neo4JNode> nodes;
    private List<Neo4JRelationship> relationships;

    public List<Neo4JNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<Neo4JNode> nodes) {
        this.nodes = nodes;
    }

    public List<Neo4JRelationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Neo4JRelationship> relationships) {
        this.relationships = relationships;
    }
}
