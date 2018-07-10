package activemq.sender;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Sender {

	private ConnectionFactory factory = null;
	private Connection connection = null;
	private Session session = null;
	private Destination destination = null;
	private MessageProducer producer = null;

	public Sender() {
	}

	public void sendMessage() {
		try {
			factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
			connection = factory.createConnection();
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			destination = session.createQueue("Queue1");
			producer = session.createProducer(destination);
			TextMessage message = session.createTextMessage();
			message.setText("Are you using maven 3.3");
			producer.send(message);
			System.out.println("Sent: " + message.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Sender sender = new Sender();
		sender.sendMessage();
	}

}
