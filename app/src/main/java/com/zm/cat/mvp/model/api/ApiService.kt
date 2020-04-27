package com.zm.cat.mvp.model.api

import com.zm.cat.mvp.model.bean.BaseResponse
import com.zm.cat.mvp.model.bean.UserBean

interface ApiService {
    suspend fun queryUser():BaseResponse<UserBean>
}