package com.verdusapplication.app.modules.pantallaprinciplcompra.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityPantallaPrincipLCompraBinding
import com.verdusapplication.app.modules.pantallaprinciplcompra.`data`.viewmodel.PantallaPrincipLCompraVM
import kotlin.String
import kotlin.Unit

class PantallaPrincipLCompraActivity :
    BaseActivity<ActivityPantallaPrincipLCompraBinding>(R.layout.activity_pantalla_princip_l_compra)
    {
  private val viewModel: PantallaPrincipLCompraVM by viewModels<PantallaPrincipLCompraVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pantallaPrincipLCompraVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PANTALLA_PRINCIP_L_COMPRA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PantallaPrincipLCompraActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
