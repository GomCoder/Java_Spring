package ch06;

import java.util.Stack;

public class Robot {
	
	//�̷� ����
	public class Maze {
		public int[][] myMaze = {
				{0, 1, 1, 1, 0, 1, 1, 1},
				{0, 0, 0, 1, 0, 0, 0, 0},
				{1, 1, 0, 0, 0, 1, 0, 1},
				{1, 1, 0, 1, 1, 1, 0, 1},
				{1, 0, 0, 1, 0, 0, 0, 0},
				{0, 1, 1, 1, 0, 1, 1, 1},
				{1, 0, 1, 1, 0, 0, 0, 0},
				{0, 1, 1, 0, 1, 1, 1, 0}
		};
	}
	
	//�����̴� ��ġ
	public class Move {
		 int direction = 0;
		 
		 public int x = 0;
		 public int y = 0;
		 
		 public Move(int x, int y) {
			 this.x = x;
			 this.y = y;
		 }
	}
	
	//�������� ǥ���� ������
	public static int NUMDRIECTIONS = 4;
	public static int WIDTH = 8;
	public static int HEIGHT = 8;
	
	Stack<Move> stack = new Stack<Move>();
	Move move;
	Maze maze = new Maze();
	
	public int[][] DIRECTION_OFFSETS = {
			{0, -1}, //�������� �̵�
			{1, 0}, //���������� �̵�
			{0, 1}, //�Ʒ������� �̵�
			{-1, 0}, //�������� �̵�
	};
	
	public static int NOT_VISIT = 0;
	public static int WALL = 1;
	public static int VISIT = 2;
	int[][] markArray = new int[8][8];
	
	//�ⱸ�� ã��
	public void findPath(int startX, int startY, int endX, int endY) {
		boolean isEmpty = false;
		boolean isFound = false;
		int i = 0;
		
		Move start = new Move(startX, startY);
		
		start.direction = 0;
		stack.push(start);
		
		while(isEmpty == false && isFound == false) {
			
			Move curPos = stack.pop();
			int x = curPos.x;
			int y = curPos.y;
			int direction = curPos.direction;
			
			while(isFound == false && direction < NUMDRIECTIONS) {
				int newX = x + DIRECTION_OFFSETS[direction][0];
				int newY = y + DIRECTION_OFFSETS[direction][1];
				
				if(newX >= 0 && newX < WIDTH 
										&& newY >= 0 && newY < HEIGHT
										&& maze.myMaze[newY][newX] == NOT_VISIT
										&& markArray[newY][newX] == NOT_VISIT ) {
					 Move newPosition = new Move(newX, newY);
					 newPosition.direction = direction + 1;
					 stack.push(newPosition);
					 markArray[y][x] = VISIT;
					 
					 x = newX;
					 y = newY;
					 direction = 0;
					 
					 if(newX == endX && newY == endY) {
						 isFound = true;
						 newPosition.x = newX;
						 newPosition.y = newY;
						 newPosition.direction = 0;
						 stack.push(newPosition);
						 markArray[newY][newX] = VISIT;						 
					 }
				}
				else direction++;				
			}
			isEmpty = stack.isEmpty();		
		}		
	}
	
	//ã�� �� ����ϱ�
	public void showPath() {
		int[][] resultArray = new int[8][8];
		boolean isEmpty = false;
		
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				resultArray[i][j] = maze.myMaze[i][j];
			}
		}
		
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				if(maze.myMaze[i][j] == WALL) {
					System.out.print("*");
				} else if (markArray[i][j] == VISIT) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		int i = 0;
		while(isEmpty == false) {
			Move move = stack.pop();
			int x = move.x;
			int y = move.y;
			resultArray[y][x] = VISIT;
			
			if(i > 0) {
				System.out.print("<-");
			}
			System.out.print("(" + x + "," + y + ") ");
			i++;
			isEmpty = stack.isEmpty();			
		}
		System.out.println();		
	}	

	public static void main(String[] args) {
		Robot robot;
		System.out.println("�ⱸ�� ���� �Դϴ�. (7, 7)");
		
		robot = new Robot();
		
		robot.findPath(0, 0, 7, 7);
		robot.showPath();
	}
}