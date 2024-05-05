package com.verdusapplication.app.modules.iniciodesesionfallido.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.iniciodesesionfallido.`data`.model.InicioDeSesionFallidoModel
import org.koin.core.KoinComponent

class InicioDeSesionFallidoVM : ViewModel(), KoinComponent {
  val inicioDeSesionFallidoModel: MutableLiveData<InicioDeSesionFallidoModel> =
      MutableLiveData(InicioDeSesionFallidoModel())

  var navArguments: Bundle? = null
}
