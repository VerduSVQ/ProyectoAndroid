package com.verdusapplication.app.modules.pantallaprinciplmenuone.ui

import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityPantallaPrincipLMenuOneBinding
import com.verdusapplication.app.modules.pantallaprinciplcompra.ui.PantallaPrincipLCompraActivity
import com.verdusapplication.app.modules.pantallaprinciplmenuone.`data`.viewmodel.PantallaPrincipLMenuOneVM
import kotlin.String
import kotlin.Unit

class PantallaPrincipLMenuOneActivity :
    BaseActivity<ActivityPantallaPrincipLMenuOneBinding>(R.layout.activity_pantalla_princip_l_menu_one)
    {
  private val viewModel: PantallaPrincipLMenuOneVM by viewModels<PantallaPrincipLMenuOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pantallaPrincipLMenuOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowrectangleten.setOnClickListener {
      val destIntent = PantallaPrincipLCompraActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PANTALLA_PRINCIP_L_MENU_ONE_ACTIVITY"

  }
}
