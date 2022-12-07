(ns ogbe.fulcro.mui.icons.tram
  #?(:cljs (:require
            ["@mui/icons-material/Tram" :default Tram]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tram
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tram)))