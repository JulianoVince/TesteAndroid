package me.julianocampos.testesantander.investment.entity

import com.google.gson.annotations.SerializedName
/**
 * Created by julianocampos.
 */
data class MoreInfoDetailResponse(@SerializedName("fund") val fund: Double?,
                                  @SerializedName("CDI") val CDI: Double?)