package fr.free.nrw.commons.wikidata.model.gallery

class TimedTextTrack {
    private val src: String? = null
    private val srclang: String? = null
    private val label: String? = null

    fun src(): String = src!!

    fun language(): String = srclang!!

    fun label(): String = label!!
}
