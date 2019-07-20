package io.stefan.performance_test

import static EnvironmentVariable.DB_CONNECTION_URL

println 'Hello World!'

def dbConnectionUrl = System.getenv().getOrDefault(DB_CONNECTION_URL, 'default-db-url')

println "DB Connection Url - ${dbConnectionUrl}"

