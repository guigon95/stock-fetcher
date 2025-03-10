package com.guigon95.stock_fetcher.infra.gateway

import com.guigon95.stock_fetcher.application.gateway.IBrapiClient
import com.guigon95.stock_fetcher.infra.client.BrapiFeign

class BrapiFeignClient(
    val brapiFeign: BrapiFeign
): IBrapiClient {
}