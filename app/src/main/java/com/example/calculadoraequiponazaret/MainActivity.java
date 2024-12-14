
package com.example.calculadoraequiponazaret;

class mainActivity : AppCompatActivity() {

    private lateinit var resultEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultEditText = findViewById(R.id.resultEditText)
        val button1 = findViewById<Button>(R.id.button1)

                button1.setOnClickListener {
            resultEditText.append("1")
        }

        // ... (código para los demás botones) ...
    }
}



