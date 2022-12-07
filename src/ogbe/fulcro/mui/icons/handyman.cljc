(ns ogbe.fulcro.mui.icons.handyman
  #?(:cljs (:require
            ["@mui/icons-material/Handyman" :default Handyman]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-handyman
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Handyman)))