package com.verdusapplication.app.modules.pantallaprinciplcompra.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.pantallaprinciplcompra.`data`.model.PantallaPrincipLCompraModel
import org.koin.core.KoinComponent

class PantallaPrincipLCompraVM : ViewModel(), KoinComponent {
  val pantallaPrincipLCompraModel: MutableLiveData<PantallaPrincipLCompraModel> =
      MutableLiveData(PantallaPrincipLCompraModel())

  var navArguments: Bundle? = null
}
