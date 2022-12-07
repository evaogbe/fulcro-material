(ns ogbe.fulcro.mui.icons.no-luggage
  #?(:cljs (:require
            ["@mui/icons-material/NoLuggage" :default NoLuggage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-luggage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoLuggage)))