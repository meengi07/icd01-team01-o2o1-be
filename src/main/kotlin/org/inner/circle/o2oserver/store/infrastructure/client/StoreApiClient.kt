package org.inner.circle.o2oserver.store.infrastructure.client

import org.inner.circle.o2oserver.store.infrastructure.dto.StoreListResponse
import org.inner.circle.o2oserver.store.infrastructure.dto.BriefStoreInfo
import org.springframework.stereotype.Component

@Component
class StoreApiClient() {
    fun getStoreList(): StoreListResponse {
        val stores =
            listOf(
                BriefStoreInfo(
                    storeId = 1,
                    storeName = "홍길동 한식당",
                    minimumPrice = 20000,
                    deliveryPrice = 0,
                    reviewCount = 999,
                    reviewRate = 4.7,
                    thumbnailUrl = "https://s3.amazonaws.com/your-bucket-name/images/thumbnails/thumb1_abc123.jpg",
                    category = "한식",
                ),
            )

        return StoreListResponse(
            stores = stores,
            totalCount = 1,
            page = 1,
            size = 10,
            statusCode = 200,
            msg = "음식점 조회",
        )
    }
}
