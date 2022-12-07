(ns ogbe.fulcro.mui.icons.piano-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PianoRounded" :default PianoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-piano-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PianoRounded)))