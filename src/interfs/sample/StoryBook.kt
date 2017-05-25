package interfs.sample

/**
 * Created by HaohaoChang on 2017/5/23.
 */
class StoryBook(private var story:String): Readable {
    override val content: String
        get() = story //To change initializer of created properties use File | Settings | File Templates.

    override fun requireContent(): String {
        return super.requireContent()
    }
}