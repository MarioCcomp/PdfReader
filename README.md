🎓 UFRRJ Additional Hours Counter

Este projeto foi criado para ajudar os estudantes da UFRRJ a contarem suas horas adicionais de forma rápida e simples. 📑⏳

🚀 Como Funciona?

1. Baixe seus certificados 🏆
   - Acesse o portal do governo e faça o download dos seus certificados.

2. Organize os arquivos 📂
   - Coloque todos os arquivos baixados em uma pasta única.
   - Renomeie todos os arquivos para "pdf" de maneira fácil:
     - Pressione CTRL + A para selecionar todos os arquivos.
     - Pressione F2 para renomeá-los.
     - Digite pdf e pressione ENTER.

3. Pronto! ✅
   - Agora seus certificados estão organizados para serem processados pelo sistema.
  
🛠 Como configurar o caminho dos arquivos?

Para que o código funcione corretamente, é necessário ajustar o caminho onde seus arquivos PDF estão salvos. No código, encontre esta linha:

```File file = new File("your\\path\\here\\pdf (" + i + ").pdf"); // put the path of your pdfs here```

Passos para modificar o caminho:

   - Copie o caminho da pasta onde estão os PDFs:

   - No Windows: Segure SHIFT, clique com o botão direito na pasta e selecione Copiar como caminho.

   - No macOS: Clique com o botão direito na pasta, vá em Obter Informações e copie o Caminho.

   - Substitua your\path\here pelo caminho copiado, lembrando de usar dupla barra invertida (\\) no Windows. Exemplo:

📌 Objetivo

Facilitar o cálculo das horas adicionais exigidas pela universidade, automatizando a contagem e evitando erros manuais.

✨ Feito para tornar sua vida acadêmica mais simples!
