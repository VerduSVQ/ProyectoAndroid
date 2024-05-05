package com.verdusapplication.app.modules.pantallaprinciplmenuone.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PantallaPrincipLMenuOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVendedog: String? = MyApp.getInstance().resources.getString(R.string.lbl_vendedog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_mis_perros)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_registrar)
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
  var txtHusky: String? = MyApp.getInstance().resources.getString(R.string.lbl_husky)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_600)

)
