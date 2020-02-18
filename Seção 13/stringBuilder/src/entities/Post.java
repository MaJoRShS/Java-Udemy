package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	// Aqui como ele mandou o "static" ele vai sempre usar a mesma decla��o para a aplica��o toda, ent�o geral que extender essa classe pega a mesma delcara��o de data
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	/*
	 * Aqui na lista o que eu sempre tenho que lembrar � que quando ele seta uma
	 * lista assim : "List< ... > " o que vai aqui dentro � o tipo da lista, que
	 * nesse caso � uma lista de comentarios que � uma classe tamb�m ai por
	 * semantica ele deu o nome da lista de "comments" porque pode ser mais de 1
	 */
	private List<Comment> comments = new ArrayList<>();

	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	/*
	 * esse add e remove s�o da classe arrayList da qual a classe Comment � herdeira
	 * caso o contrario eu n�o conseguiria chamala
	 */
	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}