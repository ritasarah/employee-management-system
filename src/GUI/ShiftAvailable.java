package GUI;

import DataPegawai.DaftarKaryawan;
import DataPegawai.Karyawan;
import DataPegawai.ShiftKerja;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cilvia
 */
public class ShiftAvailable extends javax.swing.JFrame {
	int idPegawai;
	DaftarKaryawan datakar;
	List<ShiftKerja> listShiftAvailable;
	Karyawan karyawan;
	
	/**
	 * Creates new form ShiftAvailable
	 */
	public ShiftAvailable() {
		datakar = new DaftarKaryawan();
		listShiftAvailable = new ArrayList<>();
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        seninmalam = new javax.swing.JCheckBox();
        selasamalam = new javax.swing.JCheckBox();
        selasapagi = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rabupagi = new javax.swing.JCheckBox();
        rabumalam = new javax.swing.JCheckBox();
        kamismalam = new javax.swing.JCheckBox();
        kamispagi = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jumatpagi = new javax.swing.JCheckBox();
        jumatmalam = new javax.swing.JCheckBox();
        sabtumalam = new javax.swing.JCheckBox();
        sabtupagi = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        minggupagi = new javax.swing.JCheckBox();
        minggumalam = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        seninpagi = new javax.swing.JCheckBox();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        seninmalam.setText("Malam");
        seninmalam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seninmalamActionPerformed(evt);
            }
        });

        selasamalam.setText("Malam");

        selasapagi.setText("Pagi");
        selasapagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selasapagiActionPerformed(evt);
            }
        });

        jLabel8.setText("Selasa");

        jLabel10.setText("Rabu");

        rabupagi.setText("Pagi");
        rabupagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabupagiActionPerformed(evt);
            }
        });

        rabumalam.setText("Malam");
        rabumalam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabumalamActionPerformed(evt);
            }
        });

        kamismalam.setText("Malam");

        kamispagi.setText("Pagi");
        kamispagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kamispagiActionPerformed(evt);
            }
        });

        jLabel11.setText("Kamis");

        jLabel12.setText("Jumat");

        jumatpagi.setText("Pagi");
        jumatpagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumatpagiActionPerformed(evt);
            }
        });

        jumatmalam.setText("Malam");
        jumatmalam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumatmalamActionPerformed(evt);
            }
        });

        sabtumalam.setText("Malam");

        sabtupagi.setText("Pagi");
        sabtupagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabtupagiActionPerformed(evt);
            }
        });

        jLabel13.setText("Sabtu");

        jLabel14.setText("Minggu");

        minggupagi.setText("Pagi");
        minggupagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minggupagiActionPerformed(evt);
            }
        });

        minggumalam.setText("Malam");
        minggumalam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minggumalamActionPerformed(evt);
            }
        });

        jLabel5.setText("Hari :");

        jLabel9.setText("Senin");

        seninpagi.setText("Pagi");
        seninpagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seninpagiActionPerformed(evt);
            }
        });

        editButton.setText("Ubah");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Keluar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(minggupagi)
                        .addGap(18, 18, 18)
                        .addComponent(minggumalam))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel14)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(seninpagi)
                                .addGap(18, 18, 18)
                                .addComponent(seninmalam))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(selasapagi)
                                .addGap(18, 18, 18)
                                .addComponent(selasamalam))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rabupagi)
                                .addGap(18, 18, 18)
                                .addComponent(rabumalam))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kamispagi)
                                .addGap(18, 18, 18)
                                .addComponent(kamismalam))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jumatpagi)
                                .addGap(18, 18, 18)
                                .addComponent(jumatmalam))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(sabtupagi)
                                .addGap(18, 18, 18)
                                .addComponent(sabtumalam)))))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(18, 18, 18)
                .addComponent(editButton)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seninpagi)
                    .addComponent(seninmalam)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selasapagi)
                    .addComponent(selasamalam)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rabupagi)
                    .addComponent(rabumalam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kamispagi))
                    .addComponent(kamismalam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jumatpagi)
                        .addComponent(jumatmalam)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sabtumalam)
                    .addComponent(sabtupagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minggupagi)
                    .addComponent(minggumalam))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(cancelButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public void initShiftAvailable(int idPegawai){
		this.idPegawai = idPegawai;
		System.out.println("-init shift available-");
		listShiftAvailable.clear();
		karyawan = FormView.kar.getKaryawanByID(idPegawai);
		karyawan.refreshJadwal();
		listShiftAvailable = karyawan.getHariAvailable();
		System.out.println("shift available size="+listShiftAvailable.size());
		for(ShiftKerja sk: listShiftAvailable){
			if(sk.getId() == 1){
				seninpagi.setSelected(true);
			} else if(sk.getId() == 2){
				seninmalam.setSelected(true);
			} else if(sk.getId() == 3){
				selasapagi.setSelected(true);
			} else if(sk.getId() == 4){
				selasamalam.setSelected(true);
			} else if(sk.getId() == 5){
				rabupagi.setSelected(true);
			} else if(sk.getId() == 6){
				rabumalam.setSelected(true);
			} else if(sk.getId() == 7){
				kamispagi.setSelected(true);
			} else if(sk.getId() == 8){
				kamismalam.setSelected(true);
			} else if(sk.getId() == 9){
				jumatpagi.setSelected(true);
			} else if(sk.getId() == 10){
				jumatmalam.setSelected(true);
			} else if(sk.getId() == 11){
				sabtupagi.setSelected(true);
			} else if(sk.getId() == 12){
				sabtumalam.setSelected(true);
			} else if(sk.getId() == 13){
				minggupagi.setSelected(true);
			} else if(sk.getId() == 14){
				minggumalam.setSelected(true);
			}
		}
	}
	
    private void seninmalamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seninmalamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seninmalamActionPerformed

    private void selasapagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selasapagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selasapagiActionPerformed

    private void rabupagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rabupagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rabupagiActionPerformed

    private void rabumalamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rabumalamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rabumalamActionPerformed

    private void kamispagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kamispagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kamispagiActionPerformed

    private void jumatpagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumatpagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumatpagiActionPerformed

    private void jumatmalamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumatmalamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumatmalamActionPerformed

    private void sabtupagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabtupagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sabtupagiActionPerformed

    private void minggupagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minggupagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minggupagiActionPerformed

    private void minggumalamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minggumalamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minggumalamActionPerformed

    private void seninpagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seninpagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seninpagiActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
		this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
		boolean seninpagib= seninpagi.isSelected();
        boolean seninmalamb= seninmalam.isSelected();
        boolean selasapagib= selasapagi.isSelected();
        boolean selasamalamb= selasamalam.isSelected();
        boolean rabupagib= rabupagi.isSelected();
        boolean rabumalamb= rabumalam.isSelected();
        boolean kamispagib= kamispagi.isSelected();
        boolean kamismalamb= kamismalam.isSelected();
        boolean jumatpagib= jumatpagi.isSelected();
        boolean jumatmalamb= jumatmalam.isSelected();
        boolean sabtupagib= sabtupagi.isSelected();
        boolean sabtumalamb= sabtumalam.isSelected();
        boolean minggupagib= minggupagi.isSelected();
        boolean minggumalamb= minggumalam.isSelected();
        
        List<ShiftKerja> listkerja = new ArrayList<>();
        if(seninpagib){
            listkerja.add(new ShiftKerja(1, "pagi", "senin"));
        }
        if(seninmalamb){
            listkerja.add(new ShiftKerja(2,"malam", "senin"));
        }
        if(selasapagib){
            listkerja.add(new ShiftKerja(3, "pagi", "selasa"));
        }
        if(selasamalamb){
            listkerja.add(new ShiftKerja(4,"malam", "selasa"));
        }
        if(rabupagib){
            listkerja.add(new ShiftKerja(5, "pagi", "rabu"));
        }
        if(rabumalamb){
            listkerja.add(new ShiftKerja(6,"malam", "rabu"));
        }
        if(kamispagib){
            listkerja.add(new ShiftKerja(7, "pagi", "kamis"));
        }
        if(kamismalamb){
            listkerja.add(new ShiftKerja(8,"malam", "kamis"));
        }
        if(jumatpagib){
            listkerja.add(new ShiftKerja(9, "pagi", "jumat"));
        }
        if(jumatmalamb){
            listkerja.add(new ShiftKerja(10,"malam", "jumat"));
        }
        if(sabtupagib){
            listkerja.add(new ShiftKerja(11, "pagi", "sabtu"));
        }
        if(sabtumalamb){
            listkerja.add(new ShiftKerja(12,"malam", "sabtu"));
        }
        if(minggupagib){
            listkerja.add(new ShiftKerja(13, "pagi", "minggu"));
        }
        if(minggumalamb){
            listkerja.add(new ShiftKerja(14,"malam", "minggu"));
        }
		
		karyawan.editHariAvailable(listkerja);
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jumatmalam;
    private javax.swing.JCheckBox jumatpagi;
    private javax.swing.JCheckBox kamismalam;
    private javax.swing.JCheckBox kamispagi;
    private javax.swing.JCheckBox minggumalam;
    private javax.swing.JCheckBox minggupagi;
    private javax.swing.JCheckBox rabumalam;
    private javax.swing.JCheckBox rabupagi;
    private javax.swing.JCheckBox sabtumalam;
    private javax.swing.JCheckBox sabtupagi;
    private javax.swing.JCheckBox selasamalam;
    private javax.swing.JCheckBox selasapagi;
    private javax.swing.JCheckBox seninmalam;
    private javax.swing.JCheckBox seninpagi;
    // End of variables declaration//GEN-END:variables
}
