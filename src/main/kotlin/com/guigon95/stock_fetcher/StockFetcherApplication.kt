package com.guigon95.stock_fetcher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockFetcherApplication

fun main(args: Array<String>) {
	runApplication<StockFetcherApplication>(*args)
}
