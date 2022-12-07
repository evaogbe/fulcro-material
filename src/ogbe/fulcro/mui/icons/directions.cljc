(ns ogbe.fulcro.mui.icons.directions
  #?(:cljs (:require
            ["@mui/icons-material/Directions" :default Directions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Directions)))