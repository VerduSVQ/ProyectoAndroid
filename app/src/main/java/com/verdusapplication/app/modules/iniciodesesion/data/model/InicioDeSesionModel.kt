package com.verdusapplication.app.modules.iniciodesesion.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InicioDeSesionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIniciodesesi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_inicio_de_sesi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContrasea: String? = MyApp.getInstance().resources.getString(R.string.lbl_contrase_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIniciarsesin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iniciar_sesi_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotienescuen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_tienes_cuen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
