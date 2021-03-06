package gui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import servis.CasServisService;
import servis.ICasServis;
import servis.Pitanje;
import servis.Takmicar;
import utils.Konverter;

/**
 *
 * @author zi
 */

public class KvizForm extends javax.swing.JFrame {
	
	private ICasServis servis;
	private Takmicar takmicar;
	private int brojPitanja;
	private ArrayList<Integer> slobodnaPitanja;
	private Pitanje pitanje;
	private Random random;

	/**
	 * Creates new form KvizForm
	 */
	public KvizForm() {
		initComponents();
		slobodnaPitanja = new ArrayList<>();
		random = new Random();
	}
	
	public boolean prijava(String ime, String prezime) {
		servis = new CasServisService().getCasServisPort();
		slobodnaPitanja.clear();
		
		if(servis.isKvizPokrenut()) {
			takmicar = new Takmicar();
			takmicar.setIme(ime);
			takmicar.setPrezime(prezime);
			takmicar = servis.prijavaTakmicara(takmicar);
			if(takmicar == null)
				return false;
			
			brojPitanja = servis.preuzmiBrojPitanja();
			for(int i = 0; i < brojPitanja; i++) {
				slobodnaPitanja.add(i);
			}
			return sledecePitanje();
		} else {
			return false;
		}
	}
	
	private boolean sledecePitanje() {
		if(!slobodnaPitanja.isEmpty()) {
			int index = random.nextInt(slobodnaPitanja.size());
			pitanje = servis.preuzmiPitanje(slobodnaPitanja.get(index));
			slobodnaPitanja.remove(index);
			
			try {
				byte[] slika = pitanje.getSlika();
				BufferedImage biSlika = Konverter.byteArrayToImage(slika);
				Image sSlika = biSlika.getScaledInstance(lblSlika.getWidth(),
														 lblSlika.getHeight(),
														 Image.SCALE_SMOOTH);
				lblSlika.setIcon(new ImageIcon(sSlika));
			} catch(Exception ex) {
				return false;
			}
		} else {
			return false;
		}
		
		return true;
	}
	
	private void proveriResenje(int resenje) {
		pitanje.setOdgovor(resenje);
		takmicar = servis.proveriResenje(takmicar, pitanje);
		if(!sledecePitanje()) {
			dispose();
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSlika = new javax.swing.JLabel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnDalje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnA.setText("А");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnB.setText("Б");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.setText("Ц");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.setText("Д");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnDalje.setText("Даље");
        btnDalje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaljeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSlika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 614, Short.MAX_VALUE)
                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDalje)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSlika, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDalje)
                    .addComponent(btnD)
                    .addComponent(btnC)
                    .addComponent(btnB)
                    .addComponent(btnA))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
		proveriResenje(1);
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
		proveriResenje(2);
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
		proveriResenje(3);
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
		proveriResenje(4);
    }//GEN-LAST:event_btnDActionPerformed

    private void btnDaljeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaljeActionPerformed
		proveriResenje(0);
    }//GEN-LAST:event_btnDaljeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDalje;
    private javax.swing.JLabel lblSlika;
    // End of variables declaration//GEN-END:variables
}
