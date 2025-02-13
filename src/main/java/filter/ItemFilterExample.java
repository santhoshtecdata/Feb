package filter;


	import javax.swing.*;
	import javax.swing.event.DocumentEvent;
	import javax.swing.event.DocumentListener;
	import java.awt.*;
	import java.util.ArrayList;

	public class ItemFilterExample {
	    
	    // Create the main JFrame
	    private JFrame frame;
	    private JTextField filterField;
	    private DefaultListModel<String> listModel;
	    private JList<String> itemList;

	    public ItemFilterExample() {
	        frame = new JFrame("Filter Option Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 300);
	        frame.setLayout(new BorderLayout());

	        // Create the text field for input (filter)
	        filterField = new JTextField();
	        filterField.setPreferredSize(new Dimension(300, 30));
	        filterField.getDocument().addDocumentListener(new DocumentListener() {
	            @Override
	            public void insertUpdate(DocumentEvent e) {
	                filterItems();
	            }

	            @Override
	            public void removeUpdate(DocumentEvent e) {
	                filterItems();
	            }

	            @Override
	            public void changedUpdate(DocumentEvent e) {
	                filterItems();
	            }
	        });

	       
	        listModel = new DefaultListModel<>();
	        listModel.addElement("Santhosh");
	        listModel.addElement("Sakthi");
	        listModel.addElement("Siraj");
	        listModel.addElement("suwathi");
	        listModel.addElement("frnds");
	        listModel.addElement("dood");
	        listModel.addElement("close pannunga");
	        		

	     
	        itemList = new JList<>(listModel);
	        JScrollPane scrollPane = new JScrollPane(itemList);

	     
	        frame.add(filterField, BorderLayout.NORTH);
	        frame.add(scrollPane, BorderLayout.CENTER);

	        frame.setVisible(true);
	    }

	
	    private void filterItems() {
	        String filterText = filterField.getText().toLowerCase();
	        DefaultListModel<String> filteredModel = new DefaultListModel<>();

	        for (int i = 0; i < listModel.size(); i++) {
	            String item = listModel.getElementAt(i).toLowerCase();
	            if (item.contains(filterText)) {
	                filteredModel.addElement(listModel.getElementAt(i));
	            }
	        }

	        
	        itemList.setModel(filteredModel);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new ItemFilterExample());
	    }
	}



