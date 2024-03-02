package com.example.homework.utils

data class ItemBean(
    /** 图片地址 */
    val coverUrl: Int?,
    /** 标题 */
    val title: String?,
    /** 摘要 */
    val content: String?,
    /** 跳转使用的文字信息或视频地址*/
    val detail: String?
)