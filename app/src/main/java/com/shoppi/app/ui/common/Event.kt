package com.shoppi.app.ui.common

import androidx.lifecycle.Observer


//데이터가 한번 소비되면 더 이상 사용되지 않도록 처리하는 클래스


class Event<T>(private val content: T) {
    private var hasBeenHandled = false

    fun getContentIfNotHandeled(): T? {
        return if (hasBeenHandled) {
            null

        } else {
            hasBeenHandled = true
            content
        }
    }

}



class EventObserver<T>(private val onEventUnhandledContent: (T) -> Unit) : Observer<Event<T>> {
    override fun onChanged(event: Event<T>?) {
        event?.getContentIfNotHandeled()?.let {
            onEventUnhandledContent(it)
        }

    }
}