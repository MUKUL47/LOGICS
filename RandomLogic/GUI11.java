import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class GUI11 extends JFrame {
    JPanel jp = new JPanel();
    String[] Studentabsent={}; JFrame j= new JFrame("ATTENDANCE FORM");
    JLabel title = new JLabel("ATTENDANCE OF STUDENTS");
    JLabel course = new JLabel("COURSE ID");
 String[] coursee={"CSE","MEE","PEE"};
    JButton submit = new JButton("SUBMIT");
    JCheckBox select = new JCheckBox("SELECT ALL");
    JComboBox Present = new JComboBox(coursee);
     String[] Student={"C001","C002","C003","C004","C005"};
     JList present1 = new JList(Student);
      JList absent = new JList();
    JScrollPane jsp = new JScrollPane(present1);
     JScrollPane jsp1 = new JScrollPane(absent);
     DefaultListModel dm = new DefaultListModel();
     JButton selectedone= new JButton("SELECT ABSENTIES");
    JButton selectall = new JButton("SELECT ALL stu");
       public static void main(String[] args) {
      GUI11 t = new GUI11();
      t.GUI();;
        
    }
   
   void GUI(){javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jp);
        jp.setLayout(jPanel1Layout);
        j.setSize(700,500);j.add(jp);
        LayoutManager lm=null;
    jp.setLayout(lm);
        j.setVisible(true);
       title.setBounds(200, 0, 200, 20);
        jp.add(title);
        submit.setBounds(220,400,100,30);
        jp.add(submit);
    Present.setBounds(70,100,100,100);
    jp.add(selectedone);
    selectedone.setBounds(390, 400, 169, 50);
    
   
        jp.add(Present);
        course.setBounds(70,50,80,80);
        jp.add(course);
        JLabel studentsp= new JLabel("STUDENTS");
        studentsp.setBounds(200,50,80,80);
        jp.add(studentsp);
        jsp.setBounds(200,100,150,100);
       jp.add(jsp);
     JCheckBox jck= new JCheckBox("SELECT ALL");
     jck.setBounds(270,50,100,20);
     jp.add(jck);
         jsp1.setBounds(400,100,150,100);
       jp.add(jsp1);
       JLabel studenta= new JLabel("STUDENTS ABSENTIES");
        studenta.setBounds(400,50,140,80);
        jp.add(studenta);
        select.setBounds(70,100,100,40);
        jp.add(select);
         jp.add(selectall);
        selectall.setBounds(00, 150, 150, 49);
       
        submit.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           int selected[]=present1.getSelectedIndices();
           for(int i=0;i<selected.length;i++){
               System.out.println(selected[i]);
           }
            if(e.getSource()==selectall ){
                  for(int i=0;i<Student.length;i++){
                      System.out.println(Student[i]);
                            
                  }
                    
                 }
               
           }
                  
   });
        selectall.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
          if(e.getSource()==selectall){
              for(int i=0;i<Student.length;i++){
                  System.out.println(i);
              }
          }
       }
   });
        selectedone.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         while(select.isSelected())   if(e.getSource()==submit){
                
        for(int i=0;i<Student.length;i++){
            System.out.println(Student[i]);
                   
        }
            }
       }
   });
        
        
        
        
        
        
    }
}