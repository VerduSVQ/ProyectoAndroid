package com.verdusapplication.app.modules.pantallaprinciplmenu.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PantallaPrincipLMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCompradog: String? = MyApp.getInstance().resources.getString(R.string.lbl_compradog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_buscar)

)
