package com.verdusapplication.app.modules.pantallaprinciplcompraone.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PantallaPrincipLCompraOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCompradog: String? = MyApp.getInstance().resources.getString(R.string.lbl_compradog)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVendidopor: String? = MyApp.getInstance().resources.getString(R.string.lbl_vendido_por)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJosLuis: String? = MyApp.getInstance().resources.getString(R.string.lbl_jos_luis)

)
