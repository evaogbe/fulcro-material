(ns ogbe.fulcro.mui.icons.equalizer-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EqualizerRounded" :default EqualizerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-equalizer-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EqualizerRounded)))