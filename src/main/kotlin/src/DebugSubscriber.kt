package src

import io.reactivex.subscribers.DisposableSubscriber

class DebugSubscriber<T>(private val label: String? = null): DisposableSubscriber<T>() {

    override fun onNext(data: T) {
        Thread.currentThread().name.let{
            if (label == null) {
                println("$it : $data")
            }else {
                println("$it : $label       $data")
            }
        }
    }

    override fun onComplete() {

        Thread.currentThread().name.let{
            if (label == null) {
                println("$it :   완료  ")
            }else {
                println("$it : $label       완료")
            }
        }

    }

    override fun onError(t: Throwable?) {

        Thread.currentThread().name.let{
            if (label == null) {
                println("$it : 에러 = $t")
            }else {
                println("$it :   $label   에러 = $t")
            }
        }

    }

}