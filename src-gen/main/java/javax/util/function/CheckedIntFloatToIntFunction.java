/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.CheckedFunction2;

@FunctionalInterface
public interface CheckedIntFloatToIntFunction extends CheckedFunction2<Integer, Float, Integer> {

    static final long serialVersionUID = 1L;

    int applyAsInt(int left, float right) throws Throwable;

    @Override
    default Integer apply(Integer left, Float right) throws Throwable {
        return applyAsInt(left, right);
    }

}