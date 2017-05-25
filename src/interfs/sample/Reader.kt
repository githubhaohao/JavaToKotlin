package interfs.sample

/**
 * Created by HaohaoChang on 2017/5/23.
 */
class Reader() {

    fun read(readable: Readable?){
        println(readable?.requireContent())
    }
}