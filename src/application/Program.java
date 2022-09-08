package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> lessonList = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int numberOfClasses = sc.nextInt();

		for (int i = 0; i < numberOfClasses; i++) {
			System.out.println("Dados da " + (i + 1) + "a aula: ");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char type = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.nextLine();
			String title = sc.nextLine();
			if (type == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.next();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				lessonList.add(new Video(title, url, seconds));
			} else if (type == 't') {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				lessonList.add(new Task(title, description, questionCount));
			}
		}

		System.out.println();

		int durationTotal = 0;

		for (Lesson list : lessonList) {
			durationTotal += list.duration();
		}

		System.out.print("DURAÇÃO TOTAL DO CURSO = " + durationTotal + " segundos");

		sc.close();

	}

}
