package com.verdusapplication.app.modules.pantallaprinciplcompraone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.pantallaprinciplcompraone.`data`.model.PantallaPrincipLCompraOneModel
import org.koin.core.KoinComponent

class PantallaPrincipLCompraOneVM : ViewModel(), KoinComponent {
  val pantallaPrincipLCompraOneModel: MutableLiveData<PantallaPrincipLCompraOneModel> =
      MutableLiveData(PantallaPrincipLCompraOneModel())

  var navArguments: Bundle? = null
}
