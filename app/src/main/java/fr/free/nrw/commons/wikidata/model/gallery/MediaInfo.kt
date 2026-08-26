package fr.free.nrw.commons.wikidata.model.gallery

class MediaInfo {
    private val derivatives: List<MediaDerivative>? = null
    private val timedtext: List<TimedTextTrack>? = null

    fun derivatives(): List<MediaDerivative> = derivatives.orEmpty()

    fun timedTextTracks(): List<TimedTextTrack> = timedtext.orEmpty()
}
