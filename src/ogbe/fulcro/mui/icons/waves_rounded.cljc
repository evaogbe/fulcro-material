(ns ogbe.fulcro.mui.icons.waves-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WavesRounded" :default WavesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-waves-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WavesRounded)))