/*
 * ArchiveTune (2026)
 * (c) Rukamori - github.com/rukamori
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */

package moe.rukamori.archivetune.moriextractor

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BackendExtractorResponse(
    val success: Boolean,
    val title: String? = null,
    val thumbnail: String? = null,
    @SerialName("audio_url")
    val audioUrl: String? = null,
    val error: String? = null,
)
