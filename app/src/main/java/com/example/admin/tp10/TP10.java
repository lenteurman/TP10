package com.example.admin.tp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class TP10 extends AppCompatActivity {

    Button boutonclear;
    Button bouton0;
    Button boutonback;
    Button boutonenter;
    Button bouton1;
    Button bouton2;
    Button bouton3;
    Button boutonplus;
    Button bouton4;
    Button bouton5;
    Button bouton6;
    Button boutonmoins;
    Button bouton7;
    Button bouton8;
    Button bouton9;
    Button boutondiv;
    TextView champtexte;
    TextView pile1;
    TextView pile2;
    TextView pile3;
    TextView pile4;

    Stack<Integer> pile = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp10);

        //on initialise l'activité

        boutonclear = (Button) findViewById(R.id.buttonclear);
        boutonclear.setText(R.string.buttonclear);
        bouton0 = (Button) findViewById(R.id.button0);
        bouton0.setText(R.string.button0);
        boutonback = (Button) findViewById(R.id.buttonback);
        boutonback.setText(R.string.buttonback);
        boutonenter = (Button) findViewById(R.id.buttonenter);
        boutonenter.setText(R.string.buttonenter);
        bouton1 = (Button) findViewById(R.id.button1);
        bouton1.setText(R.string.button1);
        bouton2 = (Button) findViewById(R.id.button2);
        bouton2.setText(R.string.button2);
        bouton3 = (Button) findViewById(R.id.button3);
        bouton3.setText(R.string.button3);
        boutonplus = (Button) findViewById(R.id.buttonplus);
        boutonplus.setText(R.string.buttonplus);
        bouton4 = (Button) findViewById(R.id.button4);
        bouton4.setText(R.string.button4);
        bouton5 = (Button) findViewById(R.id.button5);
        bouton5.setText(R.string.button5);
        bouton6 = (Button) findViewById(R.id.button6);
        bouton6.setText(R.string.button6);
        boutonmoins = (Button) findViewById(R.id.buttonmoins);
        boutonmoins.setText(R.string.buttonmoins);
        bouton7 = (Button) findViewById(R.id.button7);
        bouton7.setText(R.string.button7);
        bouton8 = (Button) findViewById(R.id.button8);
        bouton8.setText(R.string.button8);
        bouton9 = (Button) findViewById(R.id.button9);
        bouton9.setText(R.string.button9);
        boutondiv = (Button) findViewById(R.id.buttondiv);
        boutondiv.setText(R.string.buttondiv);
        champtexte = (TextView) findViewById(R.id.textView);
        pile1 = (TextView) findViewById(R.id.pile1);
        pile2 = (TextView) findViewById(R.id.pile2);
        pile3 = (TextView) findViewById(R.id.pile3);
        pile4 = (TextView) findViewById(R.id.pile4);

        bouton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"0");
            }
        });
        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"1");
            }
        });
        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"2");
            }
        });
        bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"3");
            }
        });
        bouton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"4");
            }
        });
        bouton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"5");
            }
        });
        bouton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"6");
            }
        });
        bouton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"7");
            }
        });
        bouton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"8");
            }
        });
        bouton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champtexte.setText(champtexte.getText().toString()+"9");
            }
        });

        boutonenter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String s = champtexte.getText().toString();
                if(s.length()!=0) {
                    pile.push(Integer.parseInt(s));
                    champtexte.setText("");
                }
                //affichage des piles
                refresh();
            }
        });

        boutonback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String s = champtexte.getText().toString();
                if(s.length()!=0) {
                    champtexte.setText(s.substring(0, s.length() - 1));
                }
            }
        });

        boutonclear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                champtexte.setText("");
                refresh();
                pile.removeAllElements();
            }
        });

        boutonplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String s = champtexte.getText().toString();
                if(s.length()!=0) {
                    int var1 = pile.pop();
                    champtexte.setText("");
                    int var2 = Integer.parseInt(s);
                    int var3 = var1 + var2;
                    pile.push(var3);
                    pile1.setText(String.valueOf(var3));
                }
            }
        });

        boutonmoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String s = champtexte.getText().toString();
                if(s.length()!=0) {
                    int var1 = pile.pop();
                    champtexte.setText("");
                    int var2 = Integer.parseInt(s);
                    int var3 = var1 - var2;
                    pile.push(var3);
                    pile1.setText(String.valueOf(var3));
                }
                else champtexte.setText("-");
            }
        });

        boutondiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String s = champtexte.getText().toString();
                if(s.length()!=0) {
                    int var1 = pile.pop();
                    champtexte.setText("");
                    int var2 = Integer.parseInt(s);
                    int var3 = var1 / var2;
                    pile.push(var3);
                    pile1.setText(String.valueOf(var3));
                }
            }
        });
    }
    public void refresh() {
        if (pile.size()==0) {
            pile1.setText("");
            pile2.setText("");
            pile3.setText("");
            pile4.setText("");
        }
        else if (pile.size()==1) {
            pile1.setText(String.valueOf(pile.get(0)));
            pile2.setText("");
            pile3.setText("");
            pile4.setText("");
        }
        else if (pile.size()==2) {
            pile1.setText(String.valueOf(pile.get(1)));
            pile2.setText(String.valueOf(pile.get(0)));
            pile3.setText("");
            pile4.setText("");
        }
        else if (pile.size()==3) {
            pile1.setText(String.valueOf(pile.get(2)));
            pile2.setText(String.valueOf(pile.get(1)));
            pile3.setText(String.valueOf(pile.get(0)));
            pile4.setText("");
        }
        else {
            pile1.setText(String.valueOf(pile.get(pile.size() - 1)));
            pile2.setText(String.valueOf(pile.get(pile.size() - 2)));
            pile3.setText(String.valueOf(pile.get(pile.size() - 3)));
            pile4.setText(String.valueOf(pile.get(pile.size() - 4)));
        }
    }
}
