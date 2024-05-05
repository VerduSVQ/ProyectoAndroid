package com.verdusapplication.app.modules.pantallaregistroperro.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.pantallaregistroperro.`data`.model.PantallaRegistroPerroModel
import org.koin.core.KoinComponent

class PantallaRegistroPerroVM : ViewModel(), KoinComponent {
  val pantallaRegistroPerroModel: MutableLiveData<PantallaRegistroPerroModel> =
      MutableLiveData(PantallaRegistroPerroModel())

  var navArguments: Bundle? = null
}
