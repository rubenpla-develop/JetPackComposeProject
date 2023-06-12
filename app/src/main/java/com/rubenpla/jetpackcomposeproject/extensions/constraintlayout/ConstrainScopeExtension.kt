package com.rubenpla.jetpackcomposeproject.extensions.constraintlayout

import androidx.constraintlayout.compose.ConstrainScope
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope

fun ConstrainScope.linkConstraintTo(
    scope: ConstrainScope,
    top: ConstraintLayoutBaseScope.HorizontalAnchor? = null,
    bottom: ConstraintLayoutBaseScope.HorizontalAnchor? = null,
    start: ConstraintLayoutBaseScope.VerticalAnchor? = null,
    end: ConstraintLayoutBaseScope.VerticalAnchor? = null
) {
    top?.let { scope.top.linkTo(it) }
    start?.let { scope.start.linkTo(it) }
    bottom?.let { scope.bottom.linkTo(it) }
    end?.let { scope.end.linkTo(it) }
}