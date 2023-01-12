package com.martinsrvinicius.nubankclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.martinsrvinicius.nubankclone.adapter.AdapterPayment
import com.martinsrvinicius.nubankclone.adapter.AdapterProduct
import com.martinsrvinicius.nubankclone.databinding.ActivityMainBinding
import com.martinsrvinicius.nubankclone.model.Payment
import com.martinsrvinicius.nubankclone.model.Product

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPayment: AdapterPayment
    private lateinit var adapterProduct: AdapterProduct
    private val paymentList: MutableList<Payment> = mutableListOf()
    private val productList: MutableList<Product> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide();

        val recyclerIconPayment = binding.recyclerMenuItems
        recyclerIconPayment.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIconPayment.setHasFixedSize(true)
        adapterPayment = AdapterPayment(this, paymentList)
        recyclerIconPayment.adapter = adapterPayment
        paymentIconList()

        val recyclerProducts = binding.recyclerProducts
        recyclerProducts.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerProducts.setHasFixedSize(true)
        adapterProduct = AdapterProduct(this, productList)
        recyclerProducts.adapter = adapterProduct
        informativeTextList()
    }

    private fun paymentIconList() {
        val icon1 = Payment(R.drawable.ic_pix, "Área Pix")
        paymentList.add(icon1)

        val icon2 = Payment(R.drawable.barcode, "Pagar")
        paymentList.add(icon2)

        val icon3 = Payment(R.drawable.emprestimo, "Pegar \n Emprestado")
        paymentList.add(icon3)

        val icon4 = Payment(R.drawable.transferencia, "Transferir")
        paymentList.add(icon4)

        val icon5 = Payment(R.drawable.depositar, "Depositar")
        paymentList.add(icon5)

        val icon6 = Payment(R.drawable.ic_recarga, "Recarga \n de celular")
        paymentList.add(icon6)

        val icon7 = Payment(R.drawable.ic_cobrar, "Cobrar")
        paymentList.add(icon7)

        val icon8 = Payment(R.drawable.doacao, "Doação")
        paymentList.add(icon8)

    }

    private fun informativeTextList() {
        val txtInformative1 = Product("Participe da Promoção Tudo no Roxinho e concorra a...")
        productList.add(txtInformative1)

        val txtInformative2 = Product("Chegou o débito automático da fatura do cartão")
        productList.add(txtInformative2)

        val txtInformative3 =
            Product("Conheça a conta PJ: prática e livre de burocracia para se...")
        productList.add(txtInformative3)

        val txtInformative4 = Product("Salve seus amigos da burocracia: Faça um convite...")
        productList.add(txtInformative4)

    }


}
