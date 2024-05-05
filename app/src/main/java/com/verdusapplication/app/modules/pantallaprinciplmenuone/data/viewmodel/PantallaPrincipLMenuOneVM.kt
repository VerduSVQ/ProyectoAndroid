package com.verdusapplication.app.modules.pantallaprinciplmenuone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.pantallaprinciplmenuone.`data`.model.PantallaPrincipLMenuOneModel
import org.koin.core.KoinComponent

class PantallaPrincipLMenuOneVM : ViewModel(), KoinComponent {
  val pantallaPrincipLMenuOneModel: MutableLiveData<PantallaPrincipLMenuOneModel> =
      MutableLiveData(PantallaPrincipLMenuOneModel())

  var navArguments: Bundle? = null
}
