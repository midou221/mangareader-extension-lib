package org.hamak.mangareader.source

/**
 * A factory for creating sources at runtime.
 */
@Suppress("unused")
interface SourceFactory {
    /**
     * Create a new copy of the sources
     * @return The created sources
     */
    fun createSources(): List<Source>
}
