package com.example.uicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioGroup
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNama = findViewById<EditText>(R.id.editNama)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val imgBtn = findViewById<ImageButton>(R.id.imgButtonAdd)
        val imgButtonCancel = findViewById<ImageButton>(R.id.imgButtonCancel)

        imgButtonCancel.setOnClickListener {
            // Menghapus nama dalam plain text
            editNama.setText("")
        }

        imgBtn.setOnClickListener {
            val nama = editNama.text.toString()
            val selectedGender = radioGroup.checkedRadioButtonId
            val gender = if (selectedGender == R.id.rbPria) "Pria" else "Wanita"

            // Menampilkan pesan dalam Toast dengan informasi masukan nama dan gender
            val toastMessage = "Nama: $nama, gender: $gender telah berhasil disimpan"
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }
    }
        fun printHobi(view: View) {
        val checkBox = view as CheckBox

        val message = if (checkBox.isChecked) {
            "Anda memilih hobi ${checkBox.text}"
        } else {
            "Anda membatalkan pilihan hobi ${checkBox.text}"
        }

        // Menampilkan pesan dalam Toast dari masukkan hobi xheck box
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}