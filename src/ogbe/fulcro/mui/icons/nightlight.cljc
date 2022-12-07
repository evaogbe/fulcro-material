(ns ogbe.fulcro.mui.icons.nightlight
  #?(:cljs (:require
            ["@mui/icons-material/Nightlight" :default Nightlight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nightlight
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Nightlight)))