package com.example.cerveja

// Importa os pacotes necessários
import android.os.Bundle  // Permite acessar e usar dados de estado salvos (como o estado de uma atividade).
import android.widget.*   // Importa os widgets do Android, como Spinner, Button e TextView.
import androidx.appcompat.app.AppCompatActivity  // Importa a classe base para atividades que utilizam ActionBar.

class MainActivity : AppCompatActivity() {  // Define a classe MainActivity que herda de AppCompatActivity, a qual proporciona compatibilidade de interface.

    private val expertCerveja = ExpertCerveja()  // Cria uma instância da classe ExpertCerveja, que provavelmente contém a lógica para fornecer as marcas de cerveja.

    override fun onCreate(savedInstanceState: Bundle?) {  // Método onCreate é chamado quando a atividade é criada.
        super.onCreate(savedInstanceState)  // Chama o método da classe mãe para configurar a atividade.
        setContentView(R.layout.activity_main)  // Define qual layout XML será usado para a interface da atividade.

        // Referencia os elementos de UI do layout pelo ID.
        val spinner: Spinner = findViewById(R.id.spinnerCerveja)  // Associa o Spinner com o componente no XML (usado para seleção de itens, como tipos de cerveja).
        val button: Button = findViewById(R.id.buttonBuscar)  // Associa o botão com o componente no XML (para acionar a  busca das marcas de cerveja).
        val textView: TextView = findViewById(R.id.textViewMarcas)  // Associa o TextView com o componente no XML (onde serão exibidas as marcas de cerveja).

        // Define o que acontece quando o botão é clicado.
        button.setOnClickListener {
            val tipoSelecionado = spinner.selectedItem.toString()  // Pega o item selecionado no Spinner e o converte para uma string.
            val marcas = expertCerveja.getMarcas(tipoSelecionado)  // Usa a instância de ExpertCerveja para obter as marcas de cerveja com base no tipo selecionado.
            textView.text = marcas.joinToString(", ")  // Exibe as marcas obtidas no TextView, separadas por vírgulas.
        }
    }
}
