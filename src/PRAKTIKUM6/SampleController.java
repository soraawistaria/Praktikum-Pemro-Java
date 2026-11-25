package application;

import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController implements Initializable {
	@FXML TableView<Mahasiswa> tblMhs;
	@FXML TableColumn<Mahasiswa, String> colName;
	@FXML TableColumn<Mahasiswa, String> colNim;
	
	private ObservableList<Mahasiswa> list;
	

	@Override
	public void initialize(java.net.URL arg0, ResourceBundle arg1) {
		colName.setCellValueFactory(new PropertyValueFactory<>("nama"));
		colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
		
		List<Mahasiswa> members = List.of(
				new Mahasiswa(1, "Amalia", "2510"),
				new Mahasiswa(2, "Soraya", "8171"),
				new Mahasiswa(3, "Cherry", "20002"),
				new Mahasiswa(4, "Daffa", "1111"),
				new Mahasiswa(5, "Dziiba'an", "2222"),
				new Mahasiswa(6, "Khoiri", "3333"),
				new Mahasiswa(7, "Nurfitria", "20005"),
				new Mahasiswa(8, "Ramadhani", "20006"),
				new Mahasiswa(9, "Nayla", "20001"),
				new Mahasiswa(10, "Rizkia", "20007")
				);
		
		list = FXCollections.observableArrayList(members);
		
		tblMhs.setItems(list);
		
	}
	
}