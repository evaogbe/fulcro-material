(ns ogbe.fulcro.mui.icons.piano-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PianoSharp" :default PianoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-piano-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PianoSharp)))