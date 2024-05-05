package com.verdusapplication.app.modules.pantallaprinciplmenu.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectangletenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_pastor_belga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColorcastao: String? = MyApp.getInstance().resources.getString(R.string.msg_color_casta_o2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_400)

)
