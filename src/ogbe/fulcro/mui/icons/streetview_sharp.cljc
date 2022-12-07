(ns ogbe.fulcro.mui.icons.streetview-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StreetviewSharp" :default StreetviewSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-streetview-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StreetviewSharp)))