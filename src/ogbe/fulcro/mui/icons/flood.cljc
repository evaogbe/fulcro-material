(ns ogbe.fulcro.mui.icons.flood
  #?(:cljs (:require
            ["@mui/icons-material/Flood" :default Flood]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flood
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Flood)))