import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
public class pra {
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 301);
		shell.setText("SWT Application");
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(248, 104, 75, 25);
		lblNewLabel.setText("Wood: "+0);
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			float result=0;
			@Override
			public void mouseDoubleClick(MouseEvent e) {
			result+=2;
			lblNewLabel.setText("Wood: "+result);			
			}
		});
		btnNewButton.addSelectionListener(new SelectionAdapter() {
		});
		btnNewButton.setBounds(97, 99, 91, 25);
		btnNewButton.setText("Get More Wood");
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}