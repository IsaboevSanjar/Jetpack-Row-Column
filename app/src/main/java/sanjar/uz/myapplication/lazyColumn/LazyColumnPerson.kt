package sanjar.uz.myapplication.lazyColumn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import sanjar.uz.myapplication.lazyColumn.model.PersonRepository

@Composable
fun LazyColumnPerson() {
    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()
    LazyColumn(
        contentPadding = PaddingValues(vertical = 3.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(items = getAllData) { person ->
            CustomItem(person = person)
        }
    }
}