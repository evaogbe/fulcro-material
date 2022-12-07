(ns ogbe.fulcro.mui.icons.piano-off
  #?(:cljs (:require
            ["@mui/icons-material/PianoOff" :default PianoOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-piano-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PianoOff)))