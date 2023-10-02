package Lab1_Task2;

import java.util.Random;

import Lab1_Task2.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		// TODO
//		return NoOpAction.NO_OP;

		if (p.getLocationState() == LocationState.DIRTY) {
			return Environment.SUCK_DIRT;
		} else if (p.getAgentLocation() == Environment.LOCATION_A && p.getLocationState() != LocationState.DIRTY ) {
			Random random = new Random();
			int randomDirection = random.nextInt(3); // Tạo số ngẫu nhiên từ 0 đến 2

			switch (randomDirection) {
			case 0:
				return Environment.MOVE_UP;
			case 1:
				return Environment.MOVE_DOWN;
			case 2:
				return Environment.MOVE_RIGHT;
			default:
				// Xử lý trường hợp không mong muốn (nên không đến đây nếu mọi thứ đều đúng)
				return Environment.MOVE_UP;
			}
		} else

		if (p.getAgentLocation() == Environment.LOCATION_B && p.getLocationState() != LocationState.DIRTY) {
			Random random = new Random();
			int randomDirection = random.nextInt(3); // Tạo số ngẫu nhiên từ 0 đến 2

			switch (randomDirection) {
			case 0:
				return Environment.MOVE_UP;
			case 1:
				return Environment.MOVE_DOWN;
			case 2:
				return Environment.MOVE_LEFT;
			default:
				// Xử lý trường hợp không mong muốn (nên không đến đây nếu mọi thứ đều đúng)
				return Environment.MOVE_UP;
			}

		}else
			if ( p.getAgentLocation() == Environment.LOCATION_C && p.getLocationState() != LocationState.DIRTY) {
				Random random = new Random();
			    int randomDirection = random.nextInt(3); // Tạo số ngẫu nhiên từ 0 đến 2

			    switch (randomDirection) {
			        case 0:
			            return Environment.MOVE_RIGHT;
			        case 1:
			            return Environment.MOVE_DOWN;
			        case 2:
			            return Environment.MOVE_LEFT;
			        default:
			            // Xử lý trường hợp không mong muốn (nên không đến đây nếu mọi thứ đều đúng)
			            return Environment.MOVE_RIGHT;
			    }
			}
			return Environment.MOVE_LEFT;
	}
}