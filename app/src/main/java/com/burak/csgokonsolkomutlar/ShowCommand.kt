package com.burak.csgokonsolkomutlar

import android.content.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_show_command.*

class ShowCommand : AppCompatActivity() {

    /**
     * ShowCommandActivity Banner Reklam: ca-app-pub-8014812102703860/5109781323
     */

    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_command)

        /******************************************************************************************/

        MobileAds.initialize(this)

        mAdView = findViewById(R.id.adViewShow)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        /******************************************************************************************/

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        /** ListView da ilgili şeye basıldığında ilgili sınıfa gidiliceke ve oradaki ilgili infonun aynı sizeına gidecek ve onu döndürecek **/

        val command = intent.getStringArrayExtra("command")
        val info = intent.getStringArrayExtra("info")
        val svCheatsInfoString = intent.getBooleanExtra("svInfo", false)
        val actionBarText = intent.getStringExtra("text")
        supportActionBar?.title = actionBarText
        if (svCheatsInfoString){
            sv_cheatsInfo.visibility = View.VISIBLE
            cizgiImage.visibility = View.VISIBLE
        }


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, info)
        showCommandsListView.adapter = adapter


        showCommandsListView.setOnItemClickListener { parent, view, position, id ->

            val alert = AlertDialog.Builder(this)
            alert.setTitle("Komut")
            alert.setMessage(command[position])
            alert.setNeutralButton("Kapat") {dialog : DialogInterface, _ : Int ->
                dialog.cancel()
            }
            alert.setPositiveButton("Kodu Paylaş") {dialog : DialogInterface, _ : Int ->
                shareTheCommand(dialog, command[position], info[position])
            }
            alert.setNegativeButton("Kodu Kopyala") {dialog : DialogInterface, _ : Int ->
                copyToClipboard(dialog, command[position])
            }
            alert.show()

        }
    }

    private fun shareTheCommand(dialog : DialogInterface, command : String, info : String){
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.type = "text/plain"
        sendIntent.putExtra(Intent.EXTRA_TEXT, "$info:\n\n$command")
        startActivity(Intent.createChooser(sendIntent,"Geçerli Kodu Paylaş"))
        dialog.cancel()
    }

    private fun copyToClipboard(dialog : DialogInterface, command : String){
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("text", command)
        clipboardManager.setPrimaryClip(clipData)
        Toast.makeText(this, "Kopyalandı", Toast.LENGTH_SHORT).show()
        dialog.cancel()
    }
}