package com.iliazusik.youtubeapi.data.models

data class PlaylistItemModel(
    val etag: String,
    val items: List<ItemItem>,
    val kind: String,
    val pageInfo: PageInfoItem
)

data class ItemItem(
    val contentDetails: ContentDetailsItem,
    val etag: String,
    val id: String,
    val kind: String,
    val snippet: SnippetItem
)

data class PageInfoItem(
    val resultsPerPage: Int,
    val totalResults: Int
)

data class ContentDetailsItem(
    val videoId: String,
    val videoPublishedAt: String
)

data class SnippetItem(
    val channelId: String,
    val channelTitle: String,
    val description: String,
    val playlistId: String,
    val position: Int,
    val publishedAt: String,
    val resourceId: ResourceIdItem,
    val thumbnails: ThumbnailsItem,
    val title: String,
    val videoOwnerChannelId: String,
    val videoOwnerChannelTitle: String
)

data class ResourceIdItem(
    val kind: String,
    val videoId: String
)

data class ThumbnailsItem(
    val default: DefaultItem,
    val high: HighItem,
    val maxres: MaxresItem,
    val medium: MediumItem,
    val standard: StandardItem
)

data class DefaultItem(
    val height: Int,
    val url: String,
    val width: Int
)

data class HighItem(
    val height: Int,
    val url: String,
    val width: Int
)

data class MaxresItem(
    val height: Int,
    val url: String,
    val width: Int
)

data class MediumItem(
    val height: Int,
    val url: String,
    val width: Int
)

data class StandardItem(
    val height: Int,
    val url: String,
    val width: Int
)