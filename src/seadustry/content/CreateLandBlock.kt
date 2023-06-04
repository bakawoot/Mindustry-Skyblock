package seadustry.content

import mindustry.content.Items
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.Block
import seadustry.world.CreateLand

class CreateLandBlock {
    companion object {
        lateinit var createLand: Block

        fun load() {
            createLand = CreateLand("createLand").apply {
                requirements(Category.effect, ItemStack.with(Items.copper, 5, Items.metaglass, 3))
                alwaysUnlocked = true
            }
        }
    }
}
