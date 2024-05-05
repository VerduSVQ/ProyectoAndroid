package com.verdusapplication.app.modules.pantallaprinciplcompra.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PantallaPrincipLCompraModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVendedog: String? = MyApp.getInstance().resources.getString(R.string.lbl_vendedog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_pastor_belga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_400)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMesesCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_meses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_caracter_sticas)

)
