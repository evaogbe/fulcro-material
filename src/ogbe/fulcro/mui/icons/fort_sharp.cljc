(ns ogbe.fulcro.mui.icons.fort-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FortSharp" :default FortSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fort-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FortSharp)))