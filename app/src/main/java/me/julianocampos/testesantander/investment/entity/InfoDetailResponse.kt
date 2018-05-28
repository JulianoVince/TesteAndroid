package me.julianocampos.testesantander.investment.entity

import com.google.gson.annotations.SerializedName
/**
 * Created by julianocampos.
 */
data class InfoDetailResponse(@SerializedName("name") val name: String?,
                              @SerializedName("data") val data: String?)