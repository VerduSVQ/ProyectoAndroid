package com.verdusapplication.app.modules.pantallaprinciplcompraone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityPantallaPrincipLCompraOneBinding
import com.verdusapplication.app.modules.pantallaprinciplcompraone.`data`.viewmodel.PantallaPrincipLCompraOneVM
import kotlin.String
import kotlin.Unit

class PantallaPrincipLCompraOneActivity :
    BaseActivity<ActivityPantallaPrincipLCompraOneBinding>(R.layout.activity_pantalla_princip_l_compra_one)
    {
  private val viewModel: PantallaPrincipLCompraOneVM by viewModels<PantallaPrincipLCompraOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pantallaPrincipLCompraOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PANTALLA_PRINCIP_L_COMPRA_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PantallaPrincipLCompraOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
