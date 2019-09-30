package src.section01

import io.reactivex.Flowable
import src.DebugSubscriber

fun main () {
    val flowable: Flowable<String> = Flowable.just("A" , "B" , "C" , "D" , "E")
    flowable.subscribe(DebugSubscriber<String>())
}