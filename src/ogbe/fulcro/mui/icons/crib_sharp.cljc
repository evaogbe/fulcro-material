(ns ogbe.fulcro.mui.icons.crib-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CribSharp" :default CribSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crib-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CribSharp)))