package com.verdusapplication.app.modules.pantallaregistroperro.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PantallaRegistroPerroModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVendedog: String? = MyApp.getInstance().resources.getString(R.string.lbl_vendedog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAadirfoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_a_adir_foto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRaza: String? = MyApp.getInstance().resources.getString(R.string.lbl_raza)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdad: String? = MyApp.getInstance().resources.getString(R.string.lbl_edad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_color)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRazapadre: String? = MyApp.getInstance().resources.getString(R.string.lbl_raza_padre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColorpadre: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_padre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRazamadre: String? = MyApp.getInstance().resources.getString(R.string.lbl_raza_madre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColormadre: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_madre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocalizacintr: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_localizaci_ntr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleThirtyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleThirtyOneValue: String? = null
)
