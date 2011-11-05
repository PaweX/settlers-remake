package jsettlers.common.buildings;

import java.util.List;

import jsettlers.common.mapobject.EMapObjectType;
import jsettlers.common.mapobject.IMapObject;
import jsettlers.common.player.IPlayerable;
import jsettlers.common.position.ILocatable;
import jsettlers.common.selectable.ISelectable;

/**
 * This is a normal building.
 * <p>
 * Buildings are map objects wit type {@link EMapObjectType#BUILDING}
 * 
 * @author michael
 */
public interface IBuilding extends IMapObject, IPlayerable, ISelectable,
        ILocatable {

	/**
	 * Gets the type definition for the building.
	 * 
	 * @return The building type.
	 */
	public EBuildingType getBuildingType();

	/**
	 * TODO: do we need this?
	 * 
	 * @return
	 */
	public boolean isOccupied();

	/**
	 * This is a mill building. An animation is shown when {@link #isWorking()}
	 * returns true.
	 * 
	 * @author michael
	 */
	interface Mill extends IBuilding {
		/**
		 * If the woking animation of the mill should be shown.
		 * 
		 * @return True if the mill is working.
		 */
		boolean isWorking();
	}

	/**
	 * This interface should be implemented by towers that can have occupying
	 * people in them.
	 * 
	 * @author michael
	 */
	interface Occupyed extends IBuilding {
		List<IBuildingOccupyer> getOccupyers();
	}
}
