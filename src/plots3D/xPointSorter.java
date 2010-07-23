/** 
 * Author: Bjorn L. Millard
 * (c) Copyright 2010
 * 
 * ImageRail is free software; you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation; either version 3 of 
 * the License, or (at your option) any later version. SBDataPipe is distributed in the hope that 
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for 
 * more details. You should have received a copy of the GNU General Public License along with this 
 * program. If not, see http://www.gnu.org/licenses/.  */

package plots3D;

/** Sorter for sorting the points according to their xValues
 * @author BLM*/
import java.util.Comparator;

import javax.vecmath.Point3d;

public class xPointSorter implements Comparator
{
	public int compare(Object p1, Object p2)
	{
		Point3d p_1 = (Point3d) p1;
		Point3d p_2 = (Point3d) p2;
		if (p_1.x==p_2.x)
			return 1;
		return (int)((1000000)*(p_1.x-p_2.x));
	}
}

