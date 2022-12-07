(ns ogbe.fulcro.mui.icons.checkroom
  #?(:cljs (:require
            ["@mui/icons-material/Checkroom" :default Checkroom]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-checkroom
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Checkroom)))