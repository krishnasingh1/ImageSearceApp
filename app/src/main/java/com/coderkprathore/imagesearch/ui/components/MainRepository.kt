package com.coderkprathore.imagesearch.ui.components

import com.coderkprathore.imagesearch.network.ApiService
import com.coderkprathore.imagesearch.network.model.PixabayResponse
import com.coderkprathore.imagesearch.util.Constant
import com.coderkprathore.imagesearch.util.Resource
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {

  suspend fun getQueryItems(q: String) : Resource<PixabayResponse> {
      return try {
          val result = apiService.getQueryImages(query = q, apiKey = Constant.KEY, imageType = "photo&pretty")
          Resource.Success(data = result)

      }catch (e:Exception) {
          Resource.Error(message = e.message.toString())

      }
  }
}