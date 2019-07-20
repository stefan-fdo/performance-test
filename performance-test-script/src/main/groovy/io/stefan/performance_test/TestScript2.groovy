package io.stefan.performance_test

import static io.stefan.performance_test.EnvironmentVariable.DB_PASSWORD
import static io.stefan.performance_test.EnvironmentVariable.DB_SCHMEA

println 'Hello World! - Test Script 2'

def dbSchema = System.getenv().getOrDefault(DB_SCHMEA)
def dbPassword = System.getenv().getOrDefault(DB_PASSWORD)

println "DB Schmea - ${dbSchema}"

println "DB Password - ${dbPassword}"


