# TRABALHOFINAL-POO
* Um sistema de clínica médica completa com interface usando os conceitos de Programação Orientada a Objetos

```
br.uece.clinicamedica
├── main
│   └── SistemaClinica.java         # Inicializador da Interface Gráfica
├── model
│   ├── Usuario.java                # Classe abstrata (Base para Médico e Paciente)
│   ├── Medico.java                 # Entidade Médico
│   ├── Paciente.java               # Entidade Paciente
│   ├── Consulta.java               # Entidade Consulta (Agendamento/Realização)
│   ├── Avaliacao.java              # Entidade Avaliação
│   ├── Conta.java                  # Controle financeiro de consultas particulares
│   └── especialidades              # Subpacote para Herança e Polimorfismo
│       ├── Cardiologista.java
│       ├── Pediatra.java
│       └── Dermatologista.java
├── controller                      # Controladores das telas (Interação com o Usuário)
│   ├── LoginController.java
│   ├── MenuPacienteController.java
│   ├── MenuMedicoController.java
│   └── EstatisticasController.java
├── exception                       # Exceções Personalizadas (Tratamento de Erros)
│   ├── LoginInvalidoException.java
│   ├── AgendaLotadaException.java
│   ├── ConsultaInexistenteException.java
│   └── OperacaoNegadaException.java
└── repository                      # Camada de Persistência (Leitura/Escrita de Arquivos)
    ├── BancoDadosTXT.java          # Gerenciador central dos arquivos de texto
    └── LogicaSistema.java          # Onde ficam as listas na memória (ArrayLists)
```

