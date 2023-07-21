package com.example.hamariapp
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SOSedit : AppCompatActivity() {

    private lateinit var name1EditText: EditText
    private lateinit var number1EditText: EditText
    private lateinit var name2EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var name3EditText: EditText
    private lateinit var number3EditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sosediy)

        name1EditText = findViewById(R.id.name1EditText)
        number1EditText = findViewById(R.id.number1EditText)
        name2EditText = findViewById(R.id.name2EditText)
        number2EditText = findViewById(R.id.number2EditText)
        name3EditText = findViewById(R.id.name3EditText)
        number3EditText = findViewById(R.id.number3EditText)
    }

    fun onSubmitClicked(view: View) {
        // Implement your logic to process the submitted data
        // For now, we'll just display a toast message
        Toast.makeText(this, "Updated!", Toast.LENGTH_SHORT).show()
    }

    fun onClearClicked(view: View) {
        // Clear all fields
        name1EditText.text.clear()
        number1EditText.text.clear()
        name2EditText.text.clear()
        number2EditText.text.clear()
        name3EditText.text.clear()
        number3EditText.text.clear()
    }
}

