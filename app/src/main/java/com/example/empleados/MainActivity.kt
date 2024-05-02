package com.example.empleados

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.empleados.gestionempleados as gestionempleados1


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)



        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val empleadosall = listOf(

            gestionempleados1("1", "luis", "diaz", 20.10),
            gestionempleados1("2", "Carlos", "torres", 20.30),
            gestionempleados1("3", "Alfonso", "ruiz", 20.40),
            gestionempleados1("4", "Ramiros", "valencia", 20.50),
            gestionempleados1("5", "Miguel", "ortega", 20.60),


            )

            val salaryCall = SalaryCall()


            val salarys = empleadosall.map {

                salaryCall.salaryCalls(it)

            }

            val stringBuilder = StringBuilder()


            for( empleados in empleadosall){

            val salary = empleados.salario

                stringBuilder.append("$salary.name")

        }




        val btnpromedio = findViewById<Button>(R.id.btnpromedio)
        btnpromedio.setOnClickListener {


            Toast.makeText(this, "$stringBuilder", Toast.LENGTH_SHORT).show()
        }

        fun main(){

            val empleado1 = gestionempleados1("1", "luis", "diaz", 20.10  )
            val empleado2 = gestionempleados1("2", "Carlos", "Torres", 20.30  )
            val empleado3 = gestionempleados1("3", "Alfonso", "Ruiz", 20.40  )
            val empleado4 = gestionempleados1("4", "Ramiros", "Valencia", 20.50  )
            val empleado5 = gestionempleados1("5", "Miguel", "Ortega", 20.60  )



        }


    }
}

