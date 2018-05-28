package me.julianocampos.testesantander.investment.entity

import com.google.gson.annotations.SerializedName
/**
 * Created by julianocampos.
 */
data class MoreInfoResponse(

        val month: MoreInfoDetailResponse?,
        val year: MoreInfoDetailResponse?,
        @SerializedName("12months") val twelveMonths: MoreInfoDetailResponse?

)