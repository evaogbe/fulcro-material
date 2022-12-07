(ns ogbe.fulcro.mui.icons.garage
  #?(:cljs (:require
            ["@mui/icons-material/Garage" :default Garage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-garage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Garage)))