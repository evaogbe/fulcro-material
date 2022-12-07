(ns ogbe.fulcro.mui.icons.gavel-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GavelSharp" :default GavelSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gavel-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GavelSharp)))