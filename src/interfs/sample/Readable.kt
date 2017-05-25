package interfs.sample

/**
 * Created by HaohaoChang on 2017/5/23.
 */
interface Readable {
    val content: String

    fun requireContent(): String = content

}