package com.example.dialectica.ui.adapters

import com.example.dialectica.models.entity.DialectPerson
import com.example.dialectica.models.entity.DialectQuestion
import com.example.dialectica.models.DialectTheme
import com.example.dialectica.ui.talk.LocalInterest
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

class ThemeListAdapter(
    itemClickedListener: (DialectTheme) -> Unit
) : ListDelegationAdapter<List<DialectTheme>>(
    themeAdapterDelegate(itemClickedListener)
)

class QuestionListAdapter(
    itemDeleteClickedListener: (DialectQuestion) -> Unit
) : ListDelegationAdapter<List<DialectQuestion>>(
    questionAdapterDelegate(itemDeleteClickedListener)
)

class InterestListAdapter(
    itemDeleteClickedListener: (String) -> Unit
) : ListDelegationAdapter<List<String>>(
    interestAdapterDelegate(itemDeleteClickedListener)
)

class InterestLocalListAdapter(
    itemDeleteClickedListener: (LocalInterest) -> Unit
) : ListDelegationAdapter<List<LocalInterest>>(
    interestLocalAdapterDelegate(itemDeleteClickedListener)
)

class PersonListAdapter(
    itemClickedListener: (DialectPerson) -> Unit,
    itemDeleteClickedListener: (DialectPerson) -> Unit
) : ListDelegationAdapter<List<DialectPerson>>(
    personAdapterDelegate(itemClickedListener, itemDeleteClickedListener)
)

class PersonAddListAdapter(
    itemClickedListener: (DialectPerson) -> Unit
) : ListDelegationAdapter<List<DialectPerson>>(
    personAddAdapterDelegate(itemClickedListener)
)
