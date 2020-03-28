package com.revolut.recyclerkit.animations.holder

import android.animation.Animator
import androidx.recyclerview.widget.RecyclerView

/*
 * Copyright (C) 2019 Revolut
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

interface AnimateRemoveViewHolder {

    fun preAnimateRemoveImpl(holder: RecyclerView.ViewHolder)

    fun animateRemoveImpl(holder: RecyclerView.ViewHolder, listener: Animator.AnimatorListener)

    fun endRemoveAnimation(holder: RecyclerView.ViewHolder)

}
