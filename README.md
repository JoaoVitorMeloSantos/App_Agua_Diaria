# Água Diária

O aplicativo **Água Diária** é uma ferramenta útil para ajudar você a monitorar sua ingestão diária de água e garantir que você atinja sua meta de hidratação.

## Funcionalidades

- **Entrada de Peso:** Insira seu peso para calcular a quantidade recomendada de água.
- **Cálculo da Meta de Hidratação:** Calcula o total de água necessário com base no peso e no volume do copo.
- **Registro de Consumo:** Marque copos de água como "bebidos" ou "não bebidos" para registrar seu consumo.
- **Exibição de Dados:** Visualize a quantidade de água consumida e a quantidade restante necessária para atingir sua meta.
- **Persistência de Dados:** Mantém os dados durante a rotação da tela, evitando perda de informações.

## Como Usar

1. **Abrir o Aplicativo:** Inicie o aplicativo em seu dispositivo Android.
2. **Inserir Peso:** Digite seu peso no campo fornecido e clique em "Calcular" para definir sua meta diária de hidratação.
3. **Registrar Consumo:** Clique nos copos representados na tela para marcar se foram bebidos ou não. O consumo total será atualizado automaticamente.
4. **Limpar Dados:** Clique no botão "Limpar" para resetar o aplicativo e começar de novo.

## Estrutura do Projeto

- **AguaDiaria:** Lógica de cálculo da quantidade diária de água e gestão dos copos.
- **AguaDiariaViewModel:** Mantém o estado dos dados da aplicação e fornece a interface para a UI.
- **Copo:** Representa um copo de água e seu estado (cheio ou vazio).
- **CopoViewModel:** Modelo de visualização para o copo, com lógica para atualizar o estado do copo.
- **AguaDiariaAdapter:** Adapter para exibir os copos em um `RecyclerView`.
- **CopoViewHolder:** ViewHolder para o `RecyclerView`, gerencia a interação com cada copo.
- **MainActivity:** A atividade principal que gerencia a interface do usuário e interações.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.


