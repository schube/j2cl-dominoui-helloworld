package scgroup;

import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.dialogs.MessageDialog;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.header.BlockHeader;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.notifications.Notification;
import org.dominokit.domino.ui.style.Color;
import org.dominokit.domino.ui.utils.TextNode;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;

public class scmodule {

	public static final String HELLO_WORLD = "Hello J2CL world!!!!!";

	public void onModuleLoad() {
		HTMLDivElement wrapper = (HTMLDivElement) DomGlobal.document.createElement("div");
		wrapper.classList.add("wrapper");

		HTMLButtonElement btn = (HTMLButtonElement) DomGlobal.document.createElement("button");
		btn.classList.add("myButton");
		btn.textContent = "J2CL !!!";

		btn.addEventListener("click", evt -> {
			btn.textContent = helloWorldString();
			Notification.create("test 22").show();
		});

		wrapper.appendChild(btn);
		MessageDialog d = MessageDialog.createMessage("Hell0");
		d.show();

		wrapper.appendChild(
				BlockHeader.create("COLLAPSIBLE CARDS", "cards can be collapsible.").element());
		wrapper.appendChild(
				Row.create()
						.addColumn(
								Column.span4()
										.appendChild(
												Card.create("3Card Title2", "Description text here!...")
														.setCollapsible()
														.setHeaderBackground(Color.THEME)
														.appendChild(TextNode.of("fds"))
														.addHeaderAction(
																Icons.ALL.more_vert(),
																event -> DomGlobal.console.info("More action selected"))))
						.addColumn(
								Column.span4()
										.appendChild(
												Card.create("2Card Title123", "Description text here...")
														.setCollapsible()
														.setHeaderBackground(Color.BROWN)
														.appendChild(TextNode.of("fds"))
														.addHeaderAction(
																Icons.AV_ICONS.mic(),
																event -> DomGlobal.console.info("Play sound"))))
						.addColumn(
								Column.span4()
										.appendChild(
												Card.create("1Card Title2", "Description text here...")
														.setCollapsible()
														.setHeaderBackground(Color.CYAN)
														.appendChild(TextNode.of("fdsdads"))
														.addHeaderAction(
																Icons.AV_ICONS.mic(), event -> DomGlobal.console.info("Play sound"))
														.addHeaderAction(
																Icons.NAVIGATION_ICONS.more_vert(),
																event -> DomGlobal.console.info("More action selected"))))
						.element());

		DomGlobal.document.body.appendChild(wrapper);
	}

	public String helloWorldString() {
		return HELLO_WORLD;
	}
}
