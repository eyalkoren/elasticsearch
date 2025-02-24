/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

module org.elasticsearch.application {
    requires org.apache.lucene.core;

    requires org.elasticsearch.base;
    requires org.elasticsearch.logging;
    requires org.elasticsearch.server;
    requires org.elasticsearch.xcontent;
    requires org.elasticsearch.xcore;

    exports org.elasticsearch.xpack.application.analytics;
    exports org.elasticsearch.xpack.application.analytics.action;
    exports org.elasticsearch.xpack.application.analytics.event;
    exports org.elasticsearch.xpack.application.analytics.event.parser.field;
    exports org.elasticsearch.xpack.application.analytics.event.parser.event;
    exports org.elasticsearch.xpack.application.analytics.ingest;

    exports org.elasticsearch.xpack.application.search;
    exports org.elasticsearch.xpack.application.search.action;
}
