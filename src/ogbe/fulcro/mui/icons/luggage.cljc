(ns ogbe.fulcro.mui.icons.luggage
  #?(:cljs (:require
            ["@mui/icons-material/Luggage" :default Luggage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-luggage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Luggage)))