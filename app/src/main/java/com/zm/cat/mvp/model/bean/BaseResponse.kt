package com.zm.cat.mvp.model.bean

import com.zm.cat.mvp.model.api.Api

class BaseResponse<T> {
    var data: T? = null
    lateinit var code: String
    lateinit var msg: String
    /**
     * 请求是否成功
     *
     * @return
     */
    fun isSuccess(): Boolean {
        return code == Api.REQUEST_SUCCESS
    }

}