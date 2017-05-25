package interfs.sample

/**
 * Created by HaohaoChang on 2017/5/23.
 */
fun main(args: Array<String>){
    val book = StoryBook("《十万个为什么？》")
    val newsPaper = NewsPaper("This is a news paper.")
    val reader = Reader()
    reader.read(book)
    reader.read(newsPaper)
}