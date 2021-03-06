/*
 * This file is part of bowler-display.
 *
 * bowler-display is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * bowler-display is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with bowler-display.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.commonwealthrobotics.bowlerdisplay.util;

import java.nio.file.Path;
import java.nio.file.Paths;

public final class Util {

  /** The directory Bowler keeps all its data in. */
  public static final Path cacheDir = Paths.get(System.getProperty("user.home"), ".bowler");
}
