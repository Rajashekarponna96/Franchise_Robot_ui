package com.example.incomingcallsexample

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.WindowManager
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.incomingcallsexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var databinding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(databinding.root)


        databinding.idNext.setOnEditorActionListener(object : TextView.OnEditorActionListener{
            override fun onEditorAction(p0: TextView?, actionId: Int, p2: KeyEvent?): Boolean {
                if (actionId === EditorInfo.IME_ACTION_DONE) {
                    // do something, e.g. set your TextView here via .setText()
                    val imm: InputMethodManager =p0?.context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(p0.windowToken, 0)
                    return true
                }
                return false
            }
        })

        databinding.idEntername.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
               Log.d("","")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                Log.d("","")

            }

            override fun afterTextChanged(p0: Editable?) {
               val data=databinding.idEntername.text.toString()
                if(data.isNotEmpty()){
                    databinding.idNext.isEnabled=true
                    databinding.idNext.setTextColor(ColorStateList.valueOf(resources.getColor(R.color.btntext_select)))
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.btn_select)))
                }else{
                    databinding.idNext.isEnabled=false
                    databinding.idNext.setTextColor(ColorStateList.valueOf(resources.getColor(R.color.btntext_unselect)))
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.btn_unselect)))

                }

            }
        })


        databinding.idNext.setOnClickListener {
            val name=databinding.idEntername.text.toString()
            val intent=Intent(this@MainActivity,TwoActivity2::class.java)
            intent.putExtra("NAME",name)
            startActivity(intent)
        }
    }
}