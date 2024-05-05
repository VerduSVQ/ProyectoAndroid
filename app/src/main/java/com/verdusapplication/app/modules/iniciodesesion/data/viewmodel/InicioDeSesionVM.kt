package com.verdusapplication.app.modules.iniciodesesion.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.iniciodesesion.`data`.model.InicioDeSesionModel
import org.koin.core.KoinComponent

class InicioDeSesionVM : ViewModel(), KoinComponent {
  val inicioDeSesionModel: MutableLiveData<InicioDeSesionModel> =
      MutableLiveData(InicioDeSesionModel())

  var navArguments: Bundle? = null
}
