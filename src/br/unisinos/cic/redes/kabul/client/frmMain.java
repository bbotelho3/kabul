package br.unisinos.cic.redes.kabul.client;

import br.unisinos.cic.redes.kabul.core.Attribute;
import br.unisinos.cic.redes.kabul.core.Card;
import br.unisinos.cic.redes.kabul.core.GameResult;
import br.unisinos.cic.redes.kabul.core.Result;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmMain extends javax.swing.JFrame {

    private dlgConnect dlgConnect;
    private GameClient gameClient;

    public frmMain() {
        dlgConnect = new dlgConnect(this, true);
        gameClient = new GameClient();

        initComponents();

        optVelocidade.setActionCommand("v");
        optCilindradas.setActionCommand("c");
        optPotentia.setActionCommand("po");
        optPeso.setActionCommand("pe");

        ActionListener listener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                btnJogar.setEnabled(true);
            }
        };

        optVelocidade.addActionListener(listener);
        optCilindradas.addActionListener(listener);
        optPotentia.addActionListener(listener);
        optPeso.addActionListener(listener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlJogo = new javax.swing.JPanel();
        pnlMensagem = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();
        pnlJogador = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblCartaJogador = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblImagemCartaJogador = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        optVelocidade = new javax.swing.JRadioButton();
        optPotentia = new javax.swing.JRadioButton();
        optCilindradas = new javax.swing.JRadioButton();
        optPeso = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        lblTotalCartasJogador = new javax.swing.JLabel();
        pnlMeio = new javax.swing.JPanel();
        btnJogar = new javax.swing.JButton();
        pnlOponente = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblCartaOponente = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblTotalCartasOponente = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblVelocidadeOponente = new javax.swing.JLabel();
        lblPotenciaOponente = new javax.swing.JLabel();
        lblCCOponente = new javax.swing.JLabel();
        lblPesoOponente = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblImagemCartaOponente = new javax.swing.JLabel();
        btgAtributos = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        pnlServidor = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblMensagemStatus = new javax.swing.JLabel();
        mnbMenu = new javax.swing.JMenuBar();
        mnuJogo = new javax.swing.JMenu();
        mniConectar = new javax.swing.JMenuItem();
        mniSair = new javax.swing.JMenuItem();
        mnuPartida = new javax.swing.JMenu();
        mniNovaPartidada = new javax.swing.JMenuItem();

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblMensagem.setText("Selecione um atributo...");

        org.jdesktop.layout.GroupLayout pnlMensagemLayout = new org.jdesktop.layout.GroupLayout(pnlMensagem);
        pnlMensagem.setLayout(pnlMensagemLayout);
        pnlMensagemLayout.setHorizontalGroup(
            pnlMensagemLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .add(lblMensagem, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMensagemLayout.setVerticalGroup(
            pnlMensagemLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .add(lblMensagem, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlJogador.setPreferredSize(new java.awt.Dimension(200, 340));

        jPanel5.setPreferredSize(new java.awt.Dimension(180, 40));

        lblCartaJogador.setText("Carta");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblCartaJogador, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblCartaJogador, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblImagemCartaJogador, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblImagemCartaJogador, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        btgAtributos.add(optVelocidade);
        optVelocidade.setText("Velocidade");

        btgAtributos.add(optPotentia);
        optPotentia.setText("Potência");

        btgAtributos.add(optCilindradas);
        optCilindradas.setText("Cilindradas");

        btgAtributos.add(optPeso);
        optPeso.setText("Peso");

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(optVelocidade)
                    .add(optPotentia)
                    .add(optCilindradas)
                    .add(optPeso))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(optVelocidade)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(optPotentia)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(optCilindradas)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(optPeso)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTotalCartasJogador.setText("Minha cartas: 99");

        org.jdesktop.layout.GroupLayout jPanel9Layout = new org.jdesktop.layout.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTotalCartasJogador, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTotalCartasJogador, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout pnlJogadorLayout = new org.jdesktop.layout.GroupLayout(pnlJogador);
        pnlJogador.setLayout(pnlJogadorLayout);
        pnlJogadorLayout.setHorizontalGroup(
            pnlJogadorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlJogadorLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlJogadorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlJogadorLayout.setVerticalGroup(
            pnlJogadorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlJogadorLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMeio.setPreferredSize(new java.awt.Dimension(200, 340));

        btnJogar.setText("Jogar");
        btnJogar.setEnabled(false);
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlMeioLayout = new org.jdesktop.layout.GroupLayout(pnlMeio);
        pnlMeio.setLayout(pnlMeioLayout);
        pnlMeioLayout.setHorizontalGroup(
            pnlMeioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlMeioLayout.createSequentialGroup()
                .addContainerGap()
                .add(btnJogar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMeioLayout.setVerticalGroup(
            pnlMeioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMeioLayout.createSequentialGroup()
                .add(138, 138, 138)
                .add(btnJogar)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pnlOponente.setPreferredSize(new java.awt.Dimension(200, 340));

        jPanel7.setPreferredSize(new java.awt.Dimension(180, 40));

        lblCartaOponente.setText("Carta");

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblCartaOponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblCartaOponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTotalCartasOponente.setText("Cartas do oponente: ");

        org.jdesktop.layout.GroupLayout jPanel10Layout = new org.jdesktop.layout.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTotalCartasOponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTotalCartasOponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblVelocidadeOponente.setText("Velocidade");

        lblPotenciaOponente.setText("Potência");

        lblCCOponente.setText("Cilindradas");

        lblPesoOponente.setText("Peso");

        org.jdesktop.layout.GroupLayout jPanel11Layout = new org.jdesktop.layout.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel11Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblVelocidadeOponente)
                    .add(lblPesoOponente)
                    .add(lblCCOponente)
                    .add(lblPotenciaOponente))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblVelocidadeOponente)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(lblPotenciaOponente)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(lblCCOponente)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(lblPesoOponente)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel12Layout = new org.jdesktop.layout.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblImagemCartaOponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblImagemCartaOponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout pnlOponenteLayout = new org.jdesktop.layout.GroupLayout(pnlOponente);
        pnlOponente.setLayout(pnlOponenteLayout);
        pnlOponenteLayout.setHorizontalGroup(
            pnlOponenteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlOponenteLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlOponenteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOponenteLayout.setVerticalGroup(
            pnlOponenteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlOponenteLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout pnlJogoLayout = new org.jdesktop.layout.GroupLayout(pnlJogo);
        pnlJogo.setLayout(pnlJogoLayout);
        pnlJogoLayout.setHorizontalGroup(
            pnlJogoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlJogoLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlJogoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlJogoLayout.createSequentialGroup()
                        .add(pnlJogador, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pnlMeio, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pnlOponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                    .add(pnlMensagem, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlJogoLayout.setVerticalGroup(
            pnlJogoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlJogoLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlMensagem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlJogoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlJogador, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .add(pnlMeio, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .add(pnlOponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblStatus.setText("Status:");

        lblMensagemStatus.setText("Não conectado");

        org.jdesktop.layout.GroupLayout pnlServidorLayout = new org.jdesktop.layout.GroupLayout(pnlServidor);
        pnlServidor.setLayout(pnlServidorLayout);
        pnlServidorLayout.setHorizontalGroup(
            pnlServidorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlServidorLayout.createSequentialGroup()
                .addContainerGap()
                .add(lblStatus)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblMensagemStatus)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        pnlServidorLayout.setVerticalGroup(
            pnlServidorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlServidorLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlServidorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblStatus)
                    .add(lblMensagemStatus))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuJogo.setText("Jogo");

        mniConectar.setText("Conectar");
        mniConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConectarActionPerformed(evt);
            }
        });
        mnuJogo.add(mniConectar);

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        mnuJogo.add(mniSair);

        mnbMenu.add(mnuJogo);

        mnuPartida.setText("Partida");

        mniNovaPartidada.setText("Nova Partida");
        mniNovaPartidada.setEnabled(false);
        mniNovaPartidada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNovaPartidadaActionPerformed(evt);
            }
        });
        mnuPartida.add(mniNovaPartidada);

        mnbMenu.add(mnuPartida);

        setJMenuBar(mnbMenu);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, pnlServidor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlMain, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(pnlMain, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(pnlServidor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConectarActionPerformed
        dlgConnect.setVisible(true);
        if (dlgConnect.getDialogResult() == DialogResult.OK) {
            String ip = dlgConnect.getIp();
            int port = dlgConnect.getPort();
            if (gameClient.connect(ip, port)) {
                mniNovaPartidada.setEnabled(true);
                lblMensagemStatus.setText("Conectado em " + ip + ":" + port);
            } else {
                lblMensagemStatus.setText("Falha na conexão");
            }
        }
    }//GEN-LAST:event_mniConectarActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSairActionPerformed

    private void mniNovaPartidadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNovaPartidadaActionPerformed
        try {
            gameClient.newGame();
            updatePlayerCard(gameClient.getNextPlayerCard());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Falha na comunicação de rede");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Falha na comunicação de rede");
        }
        clearOpponentCard();
        updateMessage("Selecione um atributo...");
        updateDeckSize();
        enableButtons();
        btgAtributos.clearSelection();
        pnlMain.add(pnlJogo);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_mniNovaPartidadaActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        try {
            switch (gameClient.getGameState()) {
                case NextPlayerTurn:
                    updatePlayerCard(gameClient.getNextPlayerCard());
                    clearOpponentCard();
                    updateMessage("Selecione um atributo...");
                    enableButtons();
                    btnJogar.setEnabled(false);
                    btgAtributos.clearSelection();
                    gameClient.playerReady();
                    break;
                case NextOpponentTurn:
                    updatePlayerCard(gameClient.getNextPlayerCard());
                    clearOpponentCard();
                    updateMessage("O oponente seleciona um atributo...");
                    disableButtons();
                    btgAtributos.clearSelection();
                    gameClient.playerReady();
                    break;
                case PlayerTurn:
                    updateOpponentCard(gameClient.getNextOpponentCard());
                    updateMessage(gameClient.playerTurn(getSelectedAttribute()));
                    disableButtons();
                    break;
                case OpponentTurn:
                    updateOpponentCard(gameClient.getNextOpponentCard());
                    setSelectedButton(gameClient.getOpponentAttribute());
                    updateMessage(gameClient.opponentTurn());
                    disableButtons();
                    break;
                case GameOver:
                    updateMessage(gameClient.getGameResult());
                    disableButtons();
                    btnJogar.setEnabled(false);
                    break;
            }
            updateDeckSize();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Falha na comunicação de rede");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Falha na comunicação de rede");
        }
    }//GEN-LAST:event_btnJogarActionPerformed

    private void disableButtons() {
        optVelocidade.setEnabled(false);
        optCilindradas.setEnabled(false);
        optPeso.setEnabled(false);
        optPotentia.setEnabled(false);
    }

    private void enableButtons() {
        optVelocidade.setEnabled(true);
        optCilindradas.setEnabled(true);
        optPeso.setEnabled(true);
        optPotentia.setEnabled(true);
    }

    private Attribute getSelectedAttribute() {
        String command = btgAtributos.getSelection().getActionCommand();
        if (command.equals("v")) {
            return Attribute.Velocidade;
        }
        if (command.equals("c")) {
            return Attribute.CC;
        }
        if (command.equals("po")) {
            return Attribute.Potencia;
        }
        return Attribute.Peso;
    }

    private void updateMessage(String message) {
        lblMensagem.setText(message);
    }

    private void updateMessage(Result result) {
        switch (result) {
            case Vitoria:
                lblMensagem.setText("Você venceu!");
                break;
            case Derrota:
                lblMensagem.setText("Você perdeu!");
                break;
            case Empate:
                lblMensagem.setText("Empate...");
                break;
        }
    }

    private void updateMessage(GameResult gameResult)
    {
        switch (gameResult) {
            case Winner:
                lblMensagem.setText("Fim do jogo! Você venceu!");
                break;
            case Loser:
                lblMensagem.setText("Fim do jogo! Você perdeu!");
                break;
        }
    }

    private void updateOpponentCard(Card card) {
        lblVelocidadeOponente.setText("Velocidade: " + card.getSpeed());
        lblPesoOponente.setText("Peso: " + card.getWeight());
        lblCCOponente.setText("Cilindradas: " + card.getCc());
        lblPotenciaOponente.setText("Potência: " + card.getPower());
        lblCartaOponente.setText(card.getName());
        lblImagemCartaOponente.setIcon(new ImageIcon(card.getImageUrl()));
    }

    private void clearOpponentCard() {
        lblVelocidadeOponente.setText("Velocidade: ?");
        lblPesoOponente.setText("Peso: ?");
        lblCCOponente.setText("Cilindradas: ?");
        lblPotenciaOponente.setText("Potência: ?");
        lblCartaOponente.setText("?");
        lblImagemCartaOponente.setIcon(null);
    }

    private void setSelectedButton(Attribute attribute) {
        switch (attribute) {
            case CC:
                optCilindradas.setSelected(true);
                break;
            case Peso:
                optPeso.setSelected(true);
                break;
            case Potencia:
                optPotentia.setSelected(true);
                break;
            case Velocidade:
                optVelocidade.setSelected(true);
                break;
        }
    }

    private void updatePlayerCard(Card card) {
        optVelocidade.setText("Velocidade: " + card.getSpeed());
        optPeso.setText("Peso: " + card.getWeight());
        optCilindradas.setText("Cilindradas: " + card.getCc());
        optPotentia.setText("Potência: " + card.getPower());
        lblCartaJogador.setText(card.getName());
        lblImagemCartaJogador.setIcon(new ImageIcon(card.getImageUrl()));
    }

    private void updateDeckSize() {
        try {
            lblTotalCartasJogador.setText("Minhas cartas: " + gameClient.getPlayerDeckSize());
            lblTotalCartasOponente.setText("Cartas do oponente: " + gameClient.getOpponentDeckSize());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Falha na comunicação de rede");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgAtributos;
    private javax.swing.JButton btnJogar;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblCCOponente;
    private javax.swing.JLabel lblCartaJogador;
    private javax.swing.JLabel lblCartaOponente;
    private javax.swing.JLabel lblImagemCartaJogador;
    private javax.swing.JLabel lblImagemCartaOponente;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblMensagemStatus;
    private javax.swing.JLabel lblPesoOponente;
    private javax.swing.JLabel lblPotenciaOponente;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTotalCartasJogador;
    private javax.swing.JLabel lblTotalCartasOponente;
    private javax.swing.JLabel lblVelocidadeOponente;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mniConectar;
    private javax.swing.JMenuItem mniNovaPartidada;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JMenu mnuJogo;
    private javax.swing.JMenu mnuPartida;
    private javax.swing.JRadioButton optCilindradas;
    private javax.swing.JRadioButton optPeso;
    private javax.swing.JRadioButton optPotentia;
    private javax.swing.JRadioButton optVelocidade;
    private javax.swing.JPanel pnlJogador;
    private javax.swing.JPanel pnlJogo;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMeio;
    private javax.swing.JPanel pnlMensagem;
    private javax.swing.JPanel pnlOponente;
    private javax.swing.JPanel pnlServidor;
    // End of variables declaration//GEN-END:variables
}
