package io.stefan.performance_test


import static io.stefan.performance_test.EnvironmentVariable.DB_SCHMEA

println 'Hello World! - Test Script 2'

def dbSchema = System.getenv().getOrDefault(DB_SCHMEA, 'default-db-schema')

println "DB Schmea - ${dbSchema}"

