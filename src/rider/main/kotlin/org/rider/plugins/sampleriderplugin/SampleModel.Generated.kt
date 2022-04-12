@file:Suppress("EXPERIMENTAL_API_USAGE","EXPERIMENTAL_UNSIGNED_LITERALS","PackageDirectoryMismatch","UnusedImport","unused","LocalVariableName","CanBeVal","PropertyName","EnumEntryName","ClassName","ObjectPropertyName","UnnecessaryVariable","SpellCheckingInspection")
package org.rider.plugins.sample.model

import com.jetbrains.rd.framework.*
import com.jetbrains.rd.framework.base.*
import com.jetbrains.rd.framework.impl.*

import com.jetbrains.rd.util.lifetime.*
import com.jetbrains.rd.util.reactive.*
import com.jetbrains.rd.util.string.*
import com.jetbrains.rd.util.*
import kotlin.reflect.KClass
import kotlin.jvm.JvmStatic



/**
 * #### Generated from [SampleModel.kt:9]
 */
class SampleModel private constructor(
    private val _someProp: RdOptionalProperty<String>,
    private val _methodInfo: RdOptionalProperty<String>,
    private val _refresh: RdSignal<Boolean>,
    private val _hasMethod: RdCall<Unit, Boolean>
) : RdExtBase() {
    //companion
    
    companion object : ISerializersOwner {
        
        override fun registerSerializersCore(serializers: ISerializers)  {
        }
        
        
        
        
        
        const val serializationHash = -262870201225251640L
        
    }
    override val serializersOwner: ISerializersOwner get() = SampleModel
    override val serializationHash: Long get() = SampleModel.serializationHash
    
    //fields
    val someProp: IOptProperty<String> get() = _someProp
    val methodInfo: IOptProperty<String> get() = _methodInfo
    
    /**
     * Refresh
     */
    val refresh: ISignal<Boolean> get() = _refresh
    val hasMethod: IRdCall<Unit, Boolean> get() = _hasMethod
    //methods
    //initializer
    init {
        _someProp.optimizeNested = true
        _methodInfo.optimizeNested = true
    }
    
    init {
        bindableChildren.add("someProp" to _someProp)
        bindableChildren.add("methodInfo" to _methodInfo)
        bindableChildren.add("refresh" to _refresh)
        bindableChildren.add("hasMethod" to _hasMethod)
    }
    
    //secondary constructor
    internal constructor(
    ) : this(
        RdOptionalProperty<String>(FrameworkMarshallers.String),
        RdOptionalProperty<String>(FrameworkMarshallers.String),
        RdSignal<Boolean>(FrameworkMarshallers.Bool),
        RdCall<Unit, Boolean>(FrameworkMarshallers.Void, FrameworkMarshallers.Bool)
    )
    
    //equals trait
    //hash code trait
    //pretty print
    override fun print(printer: PrettyPrinter)  {
        printer.println("SampleModel (")
        printer.indent {
            print("someProp = "); _someProp.print(printer); println()
            print("methodInfo = "); _methodInfo.print(printer); println()
            print("refresh = "); _refresh.print(printer); println()
            print("hasMethod = "); _hasMethod.print(printer); println()
        }
        printer.print(")")
    }
    //deepClone
    override fun deepClone(): SampleModel   {
        return SampleModel(
            _someProp.deepClonePolymorphic(),
            _methodInfo.deepClonePolymorphic(),
            _refresh.deepClonePolymorphic(),
            _hasMethod.deepClonePolymorphic()
        )
    }
    //contexts
}
val com.jetbrains.rd.ide.model.Solution.sampleModel get() = getOrCreateExtension("sampleModel", ::SampleModel)

