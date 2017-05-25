package interfs.sample

/**
 * Created by HaohaoChang on 2017/5/23.
 */
class NewsPaper(private var news: String): Readable {
    override val content: String
        get() = news //To change initializer of created properties use File | Settings | File Templates.

    override fun requireContent(): String {
        return super.requireContent()
    }

}