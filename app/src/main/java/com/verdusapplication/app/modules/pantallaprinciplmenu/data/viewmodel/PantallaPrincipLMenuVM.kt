package com.verdusapplication.app.modules.pantallaprinciplmenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.pantallaprinciplmenu.`data`.model.ListrectangletenRowModel
import com.verdusapplication.app.modules.pantallaprinciplmenu.`data`.model.PantallaPrincipLMenuModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PantallaPrincipLMenuVM : ViewModel(), KoinComponent {
  val pantallaPrincipLMenuModel: MutableLiveData<PantallaPrincipLMenuModel> =
      MutableLiveData(PantallaPrincipLMenuModel())

  var navArguments: Bundle? = null

  val listrectangletenList: MutableLiveData<MutableList<ListrectangletenRowModel>> =
      MutableLiveData(mutableListOf())
}
