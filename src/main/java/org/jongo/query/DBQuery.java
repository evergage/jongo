/*
 * Copyright (C) 2011 Greg Hinkle <greghinkle at gmail dot com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jongo.query;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import org.bson.BsonDocument;
import org.bson.BsonDocumentWrapper;
import org.bson.conversions.Bson;

public class DBQuery implements Query {

    private DBObject query;

    public DBQuery(DBObject query) {
        this.query = query;
    }

    public DBObject toDBObject() {
        return query;
    }

    @Override
    public BsonDocument toBsonDocument() {
        return BsonDocumentWrapper.asBsonDocument(query, MongoClient.getDefaultCodecRegistry());
    }
}
