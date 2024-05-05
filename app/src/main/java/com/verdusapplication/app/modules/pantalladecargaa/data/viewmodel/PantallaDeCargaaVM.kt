package com.verdusapplication.app.modules.pantalladecargaa.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.pantalladecargaa.`data`.model.PantallaDeCargaaModel
import org.koin.core.KoinComponent

class PantallaDeCargaaVM : ViewModel(), KoinComponent {
  val pantallaDeCargaaModel: MutableLiveData<PantallaDeCargaaModel> =
      MutableLiveData(PantallaDeCargaaModel())

  var navArguments: Bundle? = null
}
