package com.example.myapplication2
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init() {
        button_n_1.setOnClickListener(this)
        button_n_2.setOnClickListener(this)
        button_n_3.setOnClickListener(this)
        button_n_4.setOnClickListener(this)
        button_n_5.setOnClickListener(this)
        button_n_6.setOnClickListener(this)
        button_n_7.setOnClickListener(this)
        button_n_8.setOnClickListener(this)
        button_n_9.setOnClickListener(this)
        button_n_0.setOnClickListener(this)
        button_n_plus.setOnClickListener(this)
        button_n_minus.setOnClickListener(this)
        button_n_mul.setOnClickListener(this)
        button_n_div.setOnClickListener(this)
        button_n_eqw.setOnClickListener(this)
        button_n_del.setOnClickListener(this)
        button_n_res.setOnClickListener(this)


    }
    fun checkOperatoes( mainStr:String, operators:String):Char{
        var StrLen = mainStr.length
        var operatorLen = 4
        for(i in mainStr){
            for (j in operators){
                if(i==j){
                    return j
                }
            }

        }

        return '0'
    }
    override fun onClick(v: View) {
        var text2 = text_view2.text.toString()

        var currentAction = ""
        when(v.id){

            R.id.button_n_1 ->{text_view2.text = text2+"1"

            currentAction= currentAction+"1"}
            R.id.button_n_2 ->{text_view2.text = text2+"2"
                currentAction+="2"}
            R.id.button_n_3 ->{text_view2.text = text2+"3"
                currentAction+="3"}
            R.id.button_n_4 ->{text_view2.text = text2+"4"
                currentAction+="4"}
            R.id.button_n_5 ->{text_view2.text = text2+"5"
                currentAction+="5"}
            R.id.button_n_6 ->{text_view2.text = text2+"6"
                currentAction+="6"}
            R.id.button_n_7 ->{text_view2.text = text2+"7"
                currentAction+="7"}
            R.id.button_n_8 ->{text_view2.text = text2+"8"
                currentAction+="8"}
            R.id.button_n_9 ->{text_view2.text = text2+"9"
                currentAction+="9"}
            R.id.button_n_0 ->{text_view2.text = text2+"0"
                currentAction+="0"}
            R.id.button_n_plus ->{
                text_view2.text =text2+"+"
                currentAction = ""
                }
            R.id.button_n_minus ->{
                currentAction = ""
                text_view2.text =text2+"-"
                }
            R.id.button_n_mul ->{
                currentAction = ""
                text_view2.text =text2+"X"
                }
            R.id.button_n_div ->{
                currentAction = ""
                text_view2.text =text2+"/"
                }
            R.id.button_n_del->{
                var strLen = text_view2.text.length
                var newStr = text_view2.text.substring(0,strLen-1)
                text_view2.text = newStr
            }
            R.id.button_n_res->{
                text_view2.text = ""
            }
            R.id.button_n_eqw -> {

               // var theIndex : Int
             //       text2.indexOf()
                var operatprs = "+-X/"
                var operator = checkOperatoes(text2,operatprs)
                if(operator==' '){
                    text_view2.text = "ERROR"
                    return
                }

                var theIndex = text2.indexOf(operator)
                var firstStrElement = text2.substring(0,theIndex)
                var secondStrElement = text2.substring(theIndex+1)
                var num1 = firstStrElement.toInt()
                var num2 = secondStrElement.toInt()
                var sum=0
                when(operator){
                    '+' -> sum = num1+num2
                    '-' -> sum = num1-num2
                    'X' -> sum = num1*num2
                    '/' ->{
                        if(num2==0){
                            text_view2.text = "Divide by zero"
                            return
                        }

                        sum = num1/num2
                    }
                }


                 text_view2.text = sum.toString()
            }

        }
    }





}