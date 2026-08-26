package fr.free.nrw.commons.wikidata.model.gallery

import com.google.gson.annotations.SerializedName
import fr.free.nrw.commons.MediaType

class MediaDerivative {
    private val src: String? = null
    private val type: String? = null
    private val width = 0
    private val height = 0
    private val bandwidth = 0

    @SerializedName("transcodekey")
    private val transcodeKey: String? = null

    fun src(): String = src!!

    fun type(): String = type!!

    fun width(): Int = width

    fun height(): Int = height

    fun bandwidth(): Int = bandwidth

    fun transcodeKey(): String? = transcodeKey

    fun mediaType(): MediaType =
        when {
            mediaMimeType().startsWith("video/", ignoreCase = true) -> MediaType.VIDEO
            mediaMimeType().startsWith("audio/", ignoreCase = true) -> MediaType.AUDIO
            else -> MediaType.OTHER
        }

    private fun mediaMimeType(): String = type().substringBefore(';').trim()
}
