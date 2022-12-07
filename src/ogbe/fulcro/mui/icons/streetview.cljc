(ns ogbe.fulcro.mui.icons.streetview
  #?(:cljs (:require
            ["@mui/icons-material/Streetview" :default Streetview]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-streetview
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Streetview)))