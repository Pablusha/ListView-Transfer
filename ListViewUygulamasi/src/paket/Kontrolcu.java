package paket;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Kontrolcu implements Initializable{

    @FXML
    private ListView<String> lstAlinmayan;

    @FXML
    private ListView<String> lstAlinan;

    @FXML
    private Button btnSolCift;

    @FXML
    private Button btnSolTek;

    @FXML
    private Button btnSagCift;

    @FXML
    private Button btnSagTek;

    private ObservableList<String> alinmayandersler = FXCollections.observableArrayList();
    private ObservableList<String> alinandersler = FXCollections.observableArrayList();
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		alinmayandersler.add("Nesneye Dayalý Programlama");
		alinmayandersler.add("Görsel Programlama");
		alinmayandersler.add("Ýnternet Programcýlýðý");
		alinmayandersler.add("Mobil Programlama");
		alinmayandersler.add("Matematik");
		lstAlinmayan.setItems(alinmayandersler);
		lstAlinan.setItems(alinandersler);
	}
	
	public void secileniSagaAktar() { //Right Transfer
		String secilen = lstAlinmayan.getSelectionModel().getSelectedItem();
		if (secilen != null) {
			alinmayandersler.remove(secilen);
			alinandersler.add(secilen);
		}
	}
	
    public void hepsiniSagaAktar() { //All items to right
    	alinandersler.addAll(alinmayandersler);
    	alinmayandersler.clear();
    }
    
    public void secileniSolaAktar() { //Left Transfer
    	String secilen = lstAlinan.getSelectionModel().getSelectedItem();
    	if (secilen != null) {
			alinandersler.remove(secilen);
			alinmayandersler.add(secilen);
		}
    }
    
    public void hepsiniSolaAktar() { //All items to left
    	alinmayandersler.addAll(alinandersler);
    	alinandersler.clear();
    }
    
}
