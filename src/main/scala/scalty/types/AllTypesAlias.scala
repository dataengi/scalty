package scalty.types

import scalty.context.Context

/**
  * Created by kisilnazar on 01.10.16.
  */
trait AllTypesAlias
    extends EmptyTypeAlias
    with OrTypeAlias
    with ErrorTypeAlias
    with XorTypeAlias
    with OptionFTypeAlias
