(ns ogbe.fulcro.mui.icons.type-specimen
  #?(:cljs (:require
            ["@mui/icons-material/TypeSpecimen" :default TypeSpecimen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-type-specimen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TypeSpecimen)))