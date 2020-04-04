package br.com.covidbr.data.region

data class Region(
    val deceased: Int,
    val infected: Int,
    val records: MutableList<RegionRecord>
)