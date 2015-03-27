/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

/**
 *
 * @author Owner
 */
public class AnnoyingPhraseView extends View {
    private final String MENU = "\n"
            + "\n----------------------------------"
            + "\n| Friendly Phrase                |"
            + "\n ---------------------------------"
            + "\n1 - Destroy Tree"
            + "\n2 - Destroy Boulder"
            + "\n3 - Cross River"
            + "\n4 - Beat Dragon"
            + "\n5 - Beat Creature"
            + "\nE - Exit"
            + "\n----------------------------------";

    public AnnoyingPhraseView() {
        super();
    }
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            this.console.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);           
        
        } while (selection != 'E');
            
}

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
public void doAction(char choice) {
        
        switch (choice) {
            case '1':
                this.destroyTree();
                break;
            case '2':
                this.destroyBoulder();
                break;
            case '3':
                this.crossRiver();
                break;
            case '4':
                this.beatEnemy();
                break;
            case '5':
                this.beatCreature();    
            case 'E':
                return;
            default:
                ErrorView.display("AnnoyingPhraseView.doAction()", "\n*** Invalid Selection *** Try Again");
                break;
}
}

    private void destroyTree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void destroyBoulder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void crossRiver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void beatEnemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void beatCreature() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}